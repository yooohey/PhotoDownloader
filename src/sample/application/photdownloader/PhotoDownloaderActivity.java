package sample.application.photdownloader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.text.Html;
import android.text.method.LinkMovementMethod;

public class PhotoDownloaderActivity extends Activity {

	public Context mContext = this;
	public Object[] objects;
	static String strUrl = "http://api.bing.net/json.aspx?AppId=***&Version=2.2&Sources=image";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_downloader);
        TextView tv = (TextView)this.findViewById(R.id.textView1);
        tv.setText(Html.fromHtml(getResources().getString(R.string.label_branding)));
        tv.setMovementMethod(LinkMovementMethod.getInstance());

        View button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View arg0){
        		doSearch();
        	}
        });

        View editText1 = findViewById(R.id.editText1);
        editText1.setOnKeyListener(new OnKeyListener(){
        	@Override
        	public boolean onKey(View v, int keyCode, KeyEvent event){
        		if(event.getAction() = KeyEvent.ACTION_UP && keyCode==KeyEvent.KEYCODE_ENTER){
        			doSearch();
        			return true;
        		}
        	}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_photo_downloader, menu);
        return true;
    }


}
