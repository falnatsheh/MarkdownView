package us.feras.mdv.demo;

import us.feras.mdv.MarkdownView;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class OnlineMarkdownActivity extends Activity {
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		MarkdownView markdownView = new MarkdownView(this); 
		setContentView(markdownView);
		markdownView.loadMarkdownUrl("https://raw.github.com/falnatsheh/MarkdownView/master/README.md");
	}
}
 