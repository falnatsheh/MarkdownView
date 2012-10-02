package us.feras.mdv.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void displayDataActivity(View view) {
		this.startActivity(new Intent(this, MarkdownDataActivity.class));
	}

	public void displayThemesActivity(View view) {
		this.startActivity(new Intent(this, MarkdownThemesActivity.class));
	}

	public void displayOnlineMdActivity(View view) {
		this.startActivity(new Intent(this, OnlineMarkdownActivity.class));
	}

	public void displayLocalMdFileActivity(View view) {
		this.startActivity(new Intent(this, LocalMarkdownActivity.class));
	}

}