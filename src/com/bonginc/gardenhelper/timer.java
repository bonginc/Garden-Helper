package com.bonginc.gardenhelper;
	 
	import android.app.Activity;
	import android.os.Bundle;
	import android.os.CountDownTimer;
	import android.view.View;
	import android.view.View.OnClickListener;
	import android.widget.Button;
	import android.widget.TextView;
	import android.os.Vibrator;
	import java.lang.Object;
	import android.content.Context;
	import android.media.MediaPlayer;

	public class timer extends Activity {
	    private Button start, stop, plus, minus;
	    private TextView tv;
		MediaPlayer mp;
		Vibrator vibrator;
		int Counter;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	    
			super.onCreate(savedInstanceState);
	        setContentView(R.layout.timer);
			mp = MediaPlayer.create(this, R.raw.alarm);
			vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

	        start = (Button)findViewById(R.id.start);
	        stop = (Button)findViewById(R.id.stop);
			plus = (Button)findViewById(R.id.plus);
			minus = (Button)findViewById(R.id.minus);			
			tv  = (TextView)findViewById(R.id.tv);
	        tv.setText("30"); // startting from 30.
	 
	        final Counter timer = new Counter(30000,1000);
			
			start.setOnClickListener(new OnClickListener() {
	            @Override
	            public void onClick(View v) {
		
					timer.start();
	            }
	        });

			stop.setOnClickListener(new OnClickListener() {
	            @Override
	            public void onClick(View v) {
	                timer.cancel();
					tv.setText("30");
					mp.reset();
			}
	        });
			
			plus.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
				Counter++;
				tv.setText(""+Counter);			
				}
		});

			minus.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
				Counter--;
				tv.setText(""+Counter);
				}
		});

}
	 
	    public class Counter extends CountDownTimer{
	 
        public Counter(long millisInFuture, long countDownInterval) {
	            super(millisInFuture, countDownInterval);
	        }
	 
	        @Override
	        public void onFinish() {

	            tv.setText("Timer Completed.");
				vibrator.vibrate(2000);
				mp.start();
	       }
	 
	        @Override
	        public void onTick(long millisUntilFinished) {
//	            tv.setText((Counter/1000)+"");
	            tv.setText((millisUntilFinished/1000)+"");


	        }
	    }
			@Override
			public void onPause() {
				super.onPause();
				mp.pause();
	
		}
			@Override
			public void onResume() {
				super.onResume();

		}
			@Override
			public void onStop() {
				super.onStop();
				finish();
		}


	}
