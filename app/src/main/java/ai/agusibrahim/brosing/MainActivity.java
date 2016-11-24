package ai.agusibrahim.brosing;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.graphics.*;
import android.content.*;

public class MainActivity extends Activity implements View.OnClickListener {
	Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		btn1=(Button) findViewById(R.id.btn1);
		btn2=(Button) findViewById(R.id.btn2);
		btn3=(Button) findViewById(R.id.btn3);
		
		btn1.setTag("http://detik.com");
		btn2.setTag("http://twitter.com");
		btn3.setTag("http://facebook.com");
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		
    }

	@Override
	public void onClick(View p1) {
		String s=(String)p1.getTag();
		Intent ten=new Intent(this, Brosing.class);
		ten.putExtra("url", s);
		startActivity(ten);
	}
};
