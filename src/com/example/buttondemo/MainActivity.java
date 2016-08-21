package com.example.buttondemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity /*implements OnClickListener*/{
//	private Button button2;
	private Button button3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(this);*/
		button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Button3", Toast.LENGTH_SHORT).show();
			}
		});
	}
	
	/*public void onClick(View view) {
		Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
	}*/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/*public void onClick(View view) {
		Toast.makeText(MainActivity.this, "Button2", Toast.LENGTH_SHORT).show();
	}*/

}
