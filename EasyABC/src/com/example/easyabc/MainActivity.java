package com.example.easyabc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;


public class MainActivity extends Activity {

	MediaPlayer tone;
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
			
		tone = MediaPlayer.create(getBaseContext(),R.raw.tone);
		tone.start();
		}	
			
		
	public void second(View v) {
			
		Intent intent = new Intent(this, SecondActivity.class);
		this.startActivity(intent);						
	}
	
	public void third(View i) {
		Intent intent2 = new Intent(this, ThirdActivity.class);
		this.startActivity(intent2);	
			
	}
	
	@Override
	public void onPause(){
		super.onPause();
		tone.stop();
	}
}




