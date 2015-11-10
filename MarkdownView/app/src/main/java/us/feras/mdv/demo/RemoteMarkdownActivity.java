package us.feras.mdv.demo;

import us.feras.mdv.MarkdownView;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class RemoteMarkdownActivity extends AppCompatActivity {
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MarkdownView markdownView = new MarkdownView(this); 
		setContentView(markdownView);
		markdownView.loadMarkdownFile("https://raw.github.com/falnatsheh/MarkdownView/master/README.md");
	}
}
