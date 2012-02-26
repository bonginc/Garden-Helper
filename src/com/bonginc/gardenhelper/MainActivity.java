package com.bonginc.gardenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;


public class MainActivity extends Activity {

	@Override
    public void onCreate(Bundle tacos) {
        super.onCreate(tacos);

        setContentView(R.layout.main);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(2500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			} finally {
				Intent startProg = new Intent(MainActivity.this, intro.class);
				startActivity(startProg);
					}	
				}
			};
			timer.start();
		}
	@Override
	public void onPause() {
		super.onPause();
		finish();
	}
	
}
