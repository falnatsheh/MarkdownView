package us.feras.mdv.demo;

import us.feras.mdv.MarkdownView;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class LocalMarkdownActivity extends AppCompatActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MarkdownView webView = new MarkdownView(this);
		setContentView(webView);
		webView.loadMarkdownFile("file:///android_asset/hello.md");
	}
}
