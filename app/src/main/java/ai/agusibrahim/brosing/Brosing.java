package ai.agusibrahim.brosing;
import android.app.*;
import android.os.*;
import android.webkit.*;
import android.graphics.*;
import android.view.*;

public class Brosing extends Activity
{
	private WebView web;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.brosing);
		web=(WebView) findViewById(R.id.webs);
		getActionBar().setDisplayHomeAsUpEnabled(true);

		web.setWebViewClient(new WebViewClient() {
				@Override
				public void onPageStarted(WebView view, String url, Bitmap img) {
					Brosing.this.setTitle("Loading...");
				}

				@Override
				public void onPageFinished(WebView view, String url) {
					Brosing.this.setTitle(web.getTitle());
				}
			});
		String url=getIntent().getStringExtra("url");
		if(url!=null){
			web.loadUrl(url);
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId()==android.R.id.home) finish();
		return super.onOptionsItemSelected(item);
	}
	
}
