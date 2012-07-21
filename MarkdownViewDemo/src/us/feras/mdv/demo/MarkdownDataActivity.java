package us.feras.mdv.demo;

import us.feras.mdv.MarkdownView;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MarkdownDataActivity extends Activity {

	EditText markdownEditText;
	MarkdownView markdownView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.markdown_view);
		markdownEditText = (EditText) findViewById(R.id.markdownText);
		markdownView = (MarkdownView) findViewById(R.id.markdownView);
		String text = "## This is a demo of MarkdownView" + "\n" + "* * *" + "\n" + "### Edit the text and hit update to see the changes on the view.";
		markdownEditText.setText(text);
		markdownView.setBackgroundColor(Color.parseColor("#EED8AE"));
		updateMarkdownView();

		Button updateView = (Button) findViewById(R.id.updateButton);
		updateView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				updateMarkdownView();
			}
		});

	}

	void updateMarkdownView() {
		markdownView.loadMarkDownData(markdownEditText.getText().toString());
	}
}