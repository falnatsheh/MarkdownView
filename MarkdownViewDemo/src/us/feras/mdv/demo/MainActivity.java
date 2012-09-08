package us.feras.mdv.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Context context;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		context = this;
		
		Button mdDataButton = (Button) findViewById(R.id.local_text_button);
		mdDataButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				context.startActivity(new Intent(context, MarkdownDataActivity.class));
			}
		});
		
		Button onlineMdButton = (Button) findViewById(R.id.online_md_button);
		onlineMdButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				context.startActivity(new Intent(context, OnlineMarkdownActivity.class));
			}
		});

		Button localeMdButton = (Button) findViewById(R.id.local_md_button);
		localeMdButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				context.startActivity(new Intent(context, LocaleMarkdownActivity.class));
			}
		});
	}
}