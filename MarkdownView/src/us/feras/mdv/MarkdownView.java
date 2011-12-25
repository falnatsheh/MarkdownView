package us.feras.mdv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import us.feras.mdv.util.HttpHelper;

import android.content.Context;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.webkit.WebView;

import com.petebevin.markdown.MarkdownProcessor;

/**
 * @author Feras Alnatsheh
 */
public class MarkdownView extends WebView {

	public MarkdownView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MarkdownView(Context context) {
		super(context);
	}

	public void loadMarkDownData(String data) {
		MarkdownProcessor m = new MarkdownProcessor();
		String html = m.markdown(data);
		loadData(html, "text/html", "UTF-8");
	}

	String readFileFromAsset(String url) throws IOException {
		BufferedReader input = null;
		StringBuilder contents = new StringBuilder();
		try {
			String assetFileName = url.substring( url.lastIndexOf('/')+1, url.length());
			input = new BufferedReader(new InputStreamReader(getContext().getAssets().open(assetFileName)));
			String line = null;
			while ((line = input.readLine()) != null) {
				contents.append(line);
				contents.append(System.getProperty("line.separator"));
			}
			return contents.toString();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
			}
		}
	}

	private class LoadMarkdownUrlTask extends AsyncTask<String, Integer, String> {
		protected String doInBackground(String... urls) {
			try {
				String data;
				String url = urls[0];
				if(url.startsWith("file:///android_asset")){
					data = readFileFromAsset(url);
				}else{
					data = HttpHelper.get(url).getResponseMessage();
				}
				MarkdownProcessor m = new MarkdownProcessor();
				String html = m.markdown(data);
				return html;
			} catch (Exception ex) {
			}
			return null;
		}

		protected void onProgressUpdate(Integer... progress) {

		}

		protected void onPostExecute(String result) {
			if (result != null) {
				loadData(result, "text/html", "UTF-8");
			} else {
				loadUrl("about:blank");
			}
		}
	}

	public void loadMarkdownUrl(final String url) {
		new LoadMarkdownUrlTask().execute(url);
	}

}
