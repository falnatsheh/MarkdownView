package us.feras.mdv.demo;

import us.feras.mdv.MarkdownView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MarkdownDataActivity extends Activity {

	private EditText markdownEditText;
	private MarkdownView markdownView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.markdown_view);
		markdownEditText = (EditText) findViewById(R.id.markdownText);
		markdownView = (MarkdownView) findViewById(R.id.markdownView);
		String text = getResources().getString(R.string.md_sample_data);
		markdownEditText.setText(text);
		updateMarkdownView();

		Button updateView = (Button) findViewById(R.id.updateButton);
		updateView.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				updateMarkdownView();
			}
		});

	}

	private void updateMarkdownView() {
		markdownView.loadMarkdown(markdownEditText.getText().toString());
	}
}