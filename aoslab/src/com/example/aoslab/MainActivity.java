package com.example.aoslab;

import java.util.Locale;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements
		TextToSpeech.OnInitListener {
	/** Called when the activity is first created. */

	
	private Button btn,btn1;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		

		btn = (Button) findViewById(R.id.b1);
		btn1 = (Button) findViewById(R.id.b2);
		
	
		//txtText = (EditText) findViewById(R.id.txtText);

		// button on click event
		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent hhh = new Intent(MainActivity.this,aos.class);
				startActivity(hhh);
			}

		});
		btn1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent hhh = new Intent(MainActivity.this,dbms.class);
				startActivity(hhh);
			}

		});
		
		
	}

	@Override
	public void onInit(int arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
