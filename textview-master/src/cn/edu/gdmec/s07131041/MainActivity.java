package cn.edu.gdmec.s07131018;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;
	private EditText et;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        et = (EditText) findViewById(R.id.et);
        tv.setText("ÄãµÄÑ§ºÅÊÇ:");
        et.setText("07131018");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
