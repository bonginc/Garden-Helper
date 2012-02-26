package com.bonginc.gardenhelper;

import android.app.Activity; 
import android.app.AlertDialog; 
import android.content.Context;
import android.os.Bundle; 
import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;
import android.widget.Toast;
import android.view.Gravity;
import android.widget.RadioButton;
import android.text.TextUtils;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;

	public class nutecalc extends Activity implements View.OnClickListener {

	Button week1,week2,week3,week4,week5,week6,week7,week8,week9,week10,week11,week12,enter,clear;
	TextView bigBOuncelb, bigBTeaspoonlb,growBOuncelb, growBTeaspoonlb, tigerBTeaspoonlb;
	TextView tigerBOuncelb, openSTablespoonlb, openSTeaspoonlb, beastieBTablespoonlb;
	TextView beastieBTeaspoonlb, chaCTablespoonlb, chaCTeaspoonlb; 
	EditText input;

	@Override
	public void onCreate(Bundle porno) {
		super.onCreate(porno);
		setContentView(R.layout.nutecalc);
		textviewSetup();
		buttonSetup();
		onclickSetup();
	}

	private void textviewSetup(){
		bigBOuncelb = (TextView)findViewById(R.id.bigBOuncelb);
		bigBTeaspoonlb = (TextView)findViewById(R.id.bigBTeaspoonlb);
		growBOuncelb = (TextView)findViewById(R.id.growBOuncelb);
		growBTeaspoonlb = (TextView)findViewById(R.id.growBTeaspoonlb);
		tigerBOuncelb = (TextView)findViewById(R.id.tigerBOuncelb);
		tigerBTeaspoonlb = (TextView)findViewById(R.id.tigerBTeaspoonlb);
		openSTeaspoonlb = (TextView)findViewById(R.id.openSTeaspoonlb);
		openSTablespoonlb = (TextView)findViewById(R.id.openSTablespoonlb);
		beastieBTeaspoonlb = (TextView)findViewById(R.id.beastieBTeaspoonlb);
		beastieBTablespoonlb = (TextView)findViewById(R.id.beastieBTablespoonlb);
		chaCTeaspoonlb = (TextView)findViewById(R.id.chaCTeaspoonlb);
		chaCTablespoonlb = (TextView)findViewById(R.id.chaCTablespoonlb);
		input = (EditText)findViewById(R.id.input);
	}
		
	private void onclickSetup(){
		week1.setOnClickListener(this);
		week2.setOnClickListener(this);
		week3.setOnClickListener(this);
		week4.setOnClickListener(this);
		week5.setOnClickListener(this);
		week6.setOnClickListener(this);
		week7.setOnClickListener(this);
		week8.setOnClickListener(this);
		week9.setOnClickListener(this);
		week10.setOnClickListener(this);
		week11.setOnClickListener(this);
		week12.setOnClickListener(this);
		clear.setOnClickListener(this);

	}	

	private void buttonSetup() {

		week1 = (Button)findViewById(R.id.week1);
		week2 = (Button)findViewById(R.id.week2);
		week3 = (Button)findViewById(R.id.week3);
		week4 = (Button)findViewById(R.id.week4);
		week5 = (Button)findViewById(R.id.week5);
		week6 = (Button)findViewById(R.id.week6);
		week7 = (Button)findViewById(R.id.week7);
		week8 = (Button)findViewById(R.id.week8);
		week9 = (Button)findViewById(R.id.week9);
		week10 = (Button)findViewById(R.id.week10);
		week11 = (Button)findViewById(R.id.week11);
		week12 = (Button)findViewById(R.id.week12);
		clear = (Button)findViewById(R.id.clear);
}

	public void onClick(View view) {
		Context context = getApplicationContext();
		CharSequence text = "Forget Something? Need Gallon Input.";
		int duration = Toast.LENGTH_LONG;
		switch(view.getId()) {
		case R.id.clear:
			input.setText("");
			bigBOuncelb.setText("");
			bigBTeaspoonlb.setText("");
			growBOuncelb.setText("");
			growBTeaspoonlb.setText("");
			tigerBTeaspoonlb.setText("");
			tigerBOuncelb.setText("");
			openSTablespoonlb.setText("");
			openSTeaspoonlb.setText("");
			beastieBTablespoonlb.setText("");
			beastieBTeaspoonlb.setText("");
			chaCTablespoonlb.setText("");
			chaCTeaspoonlb.setText("");

			break;		

		case R.id.week1:
				if (input.getText().toString().isEmpty()){
				Toast toast = Toast.makeText(context, text, duration);
				toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
				toast.show();

			}else {
				double result = new Double(input.getText().toString()) * 3;
	 	        bigBTeaspoonlb.setText(Double.toString(result)); 
	 			double bigbloom = result / 6; 
	 	 		bigBOuncelb.setText(Double.toString(bigbloom)); 
	 	 		
	 			growBOuncelb.setText((""));
	 		    growBTeaspoonlb.setText((""));
	 			tigerBTeaspoonlb.setText((""));
	 		    tigerBOuncelb.setText((""));
	 			openSTablespoonlb.setText((""));
	 			openSTeaspoonlb.setText((""));
	 			beastieBTablespoonlb.setText((""));
	 			beastieBTeaspoonlb.setText((""));
	 			chaCTablespoonlb.setText((""));
	 			chaCTeaspoonlb.setText((""));
				}
			break;

		case R.id.week2:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {
			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
 	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 

			double growbig = new Double(input.getText().toString()) * 1;
 			growBTeaspoonlb.setText(Double.toString(growbig)); 
 			double growbigOunce = growbig / 6; 
 	 		growBOuncelb.setText(Double.toString(growbigOunce)); 
 	 		
 			tigerBTeaspoonlb.setText((""));
 		    tigerBOuncelb.setText((""));
 			openSTablespoonlb.setText((""));
 			openSTeaspoonlb.setText((""));
 			beastieBTablespoonlb.setText((""));
 			beastieBTeaspoonlb.setText((""));
 			chaCTablespoonlb.setText((""));
 			chaCTeaspoonlb.setText((""));
				}
			break;

		case R.id.week3:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {
			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
 	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 

			double growbig = new Double(input.getText().toString()) * 1;
 			growBTeaspoonlb.setText(Double.toString(growbig)); 
 			double growbigOunce = growbig / 6; 
 	 		growBOuncelb.setText(Double.toString(growbigOunce)); 
 	 		
 			tigerBTeaspoonlb.setText((""));
 		    tigerBOuncelb.setText((""));
 			openSTablespoonlb.setText((""));
 			openSTeaspoonlb.setText((""));
 			beastieBTablespoonlb.setText((""));
 			beastieBTeaspoonlb.setText((""));
 			chaCTablespoonlb.setText((""));
 			chaCTeaspoonlb.setText((""));
}
			break;

		case R.id.week4:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {
			double bigbloom = new Double(input.getText().toString()) * 3;
	 		bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
	 		double bigbloomOunce = bigbloom / 6; 
	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 
				  
			double growbig = new Double(input.getText().toString()) * 1;
 		    growBTeaspoonlb.setText(Double.toString(growbig)); 
 	    	double growbigOunce = growbig / 6; 
		    growBOuncelb.setText(Double.toString(growbigOunce)); 
	 	 		
			double openseasame = new Double(input.getText().toString()) * .25;
			openSTeaspoonlb.setText(Double.toString(openseasame));
			double openOunce = openseasame / 6;
			openSTablespoonlb.setText(Double.toString(openOunce));
				
			tigerBTeaspoonlb.setText((""));
			tigerBOuncelb.setText((""));
	 		beastieBTablespoonlb.setText((""));
			beastieBTeaspoonlb.setText((""));
			chaCTablespoonlb.setText((""));
	 		chaCTeaspoonlb.setText((""));
}			
			break;

		case R.id.week5:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {

			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
 	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 

			double growbig = new Double(input.getText().toString()) * .5;
 		    growBTeaspoonlb.setText(Double.toString(growbig)); 
 	    	double growbigOunce = growbig / 6; 
		    growBOuncelb.setText(Double.toString(growbigOunce)); 
	
			double tigerbloom = new Double(input.getText().toString()) * 1;
			tigerBTeaspoonlb.setText(Double.toString(tigerbloom));
			double tigerOunce = tigerbloom / 6;
			tigerBOuncelb.setText(Double.toString(tigerOunce));
			
			double openseasame = new Double(input.getText().toString()) * .25;
			openSTeaspoonlb.setText(Double.toString(openseasame));
			double openOunce = openseasame / 6;
			openSTablespoonlb.setText(Double.toString(openOunce));
			
 			beastieBTablespoonlb.setText((""));
 			beastieBTeaspoonlb.setText((""));
 			chaCTablespoonlb.setText((""));
 			chaCTeaspoonlb.setText((""));
}
			break;

		case R.id.week6:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {

			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
 	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 
 	 		
 			double tigerbloom = new Double(input.getText().toString()) * 1;
			tigerBTeaspoonlb.setText(Double.toString(tigerbloom));
			double tigerOunce = tigerbloom / 6;
			tigerBOuncelb.setText(Double.toString(tigerOunce));
			
			double beastiebloom = new Double(input.getText().toString()) * .25;
			beastieBTeaspoonlb.setText(Double.toString(beastiebloom));
			double beastiebloomOunce = beastiebloom / 6;
			beastieBTablespoonlb.setText(Double.toString(beastiebloomOunce));
			
			growBTeaspoonlb.setText((""));
			growBOuncelb.setText((""));
 			openSTablespoonlb.setText((""));
 			openSTeaspoonlb.setText((""));
 			chaCTablespoonlb.setText((""));
 			chaCTeaspoonlb.setText((""));
}
			break;
		case R.id.week7:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {
	
			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 

			double growbig = new Double(input.getText().toString()) * 1;
 		    growBTeaspoonlb.setText(Double.toString(growbig)); 
 	   		double growbigOunce = growbig / 6; 
		    growBOuncelb.setText(Double.toString(growbigOunce)); 

			double tigerbloom = new Double(input.getText().toString()) * 1;
			tigerBTeaspoonlb.setText(Double.toString(tigerbloom));
			double tigerOunce = tigerbloom / 6;
			tigerBOuncelb.setText(Double.toString(tigerOunce));
		
			double beastiebloom = new Double(input.getText().toString()) * .25;
			beastieBTeaspoonlb.setText(Double.toString(beastiebloom));
			double beastiebloomOunce = beastiebloom / 6;
			beastieBTablespoonlb.setText(Double.toString(beastiebloomOunce));
		
			openSTablespoonlb.setText((""));
			openSTeaspoonlb.setText((""));
			chaCTablespoonlb.setText((""));
			chaCTeaspoonlb.setText((""));
}
			break;
		case R.id.week8:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {

			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 

			double growbig = new Double(input.getText().toString()) * 1;
 	    	growBTeaspoonlb.setText(Double.toString(growbig)); 
	 	   	double growbigOunce = growbig / 6; 
		    growBOuncelb.setText(Double.toString(growbigOunce)); 
	
			double tigerbloom = new Double(input.getText().toString()) * 1;
			tigerBTeaspoonlb.setText(Double.toString(tigerbloom));
			double tigerOunce = tigerbloom / 6;
			tigerBOuncelb.setText(Double.toString(tigerOunce));
		
			double beastiebloom = new Double(input.getText().toString()) * .25;
			openSTeaspoonlb.setText(Double.toString(beastiebloom));
			double beastiebloomOunce = beastiebloom / 6;
			openSTablespoonlb.setText(Double.toString(beastiebloomOunce));
		
			openSTablespoonlb.setText((""));
			openSTeaspoonlb.setText((""));
			chaCTablespoonlb.setText((""));
			chaCTeaspoonlb.setText((""));
}			
			break;	
		case R.id.week9:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {
	
			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 

			double tigerbloom = new Double(input.getText().toString()) * 1;
			tigerBTeaspoonlb.setText(Double.toString(tigerbloom));
			double tigerOunce = tigerbloom / 6;
			tigerBOuncelb.setText(Double.toString(tigerOunce));
		
			double beastiebloom = new Double(input.getText().toString()) * .25;
			beastieBTeaspoonlb.setText(Double.toString(beastiebloom));
			double beastiebloomOunce = beastiebloom / 6;
			beastieBTablespoonlb.setText(Double.toString(beastiebloomOunce));
		
 		    growBTeaspoonlb.setText((""));
	    	growBOuncelb.setText((""));
	
			openSTablespoonlb.setText((""));
			openSTeaspoonlb.setText((""));
	
			chaCTeaspoonlb.setText((""));
			chaCTablespoonlb.setText((""));
}
			break;
		case R.id.week10:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {

			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 

			double tigerbloom = new Double(input.getText().toString()) * 1;
			tigerBTeaspoonlb.setText(Double.toString(tigerbloom));
			double tigerOunce = tigerbloom / 6;
			tigerBOuncelb.setText(Double.toString(tigerOunce));
		
			double chaching = new Double(input.getText().toString()) * .25;
			chaCTeaspoonlb.setText(Double.toString(chaching));
			double chachingOunce = chaching / 6;
			chaCTablespoonlb.setText(Double.toString(chachingOunce));
		
 		    growBTeaspoonlb.setText((""));
	    	growBOuncelb.setText((""));

			openSTablespoonlb.setText((""));
			openSTeaspoonlb.setText((""));

			beastieBTablespoonlb.setText((""));
			beastieBTeaspoonlb.setText((""));
}
			break;
		case R.id.week11:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {
			
			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
	 		bigBOuncelb.setText(Double.toString(bigbloomOunce)); 

			double tigerbloom = new Double(input.getText().toString()) * 1;
			tigerBTeaspoonlb.setText(Double.toString(tigerbloom));
			double tigerOunce = tigerbloom / 6;
			tigerBOuncelb.setText(Double.toString(tigerOunce));
		
			double chaching = new Double(input.getText().toString()) * .25;
			chaCTeaspoonlb.setText(Double.toString(chaching));
			double chachingOunce = chaching / 6;
			chaCTablespoonlb.setText(Double.toString(chachingOunce));
		
	 	    growBTeaspoonlb.setText((""));
		    growBOuncelb.setText((""));
	
			openSTablespoonlb.setText((""));
			openSTeaspoonlb.setText((""));
		
			beastieBTablespoonlb.setText((""));
			beastieBTeaspoonlb.setText((""));
}
			break;
		case R.id.week12:
		if (input.getText().toString().isEmpty()){
		Toast toast = Toast.makeText(context, text, duration);
		toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
		toast.show();

			}else {
			
			double bigbloom = new Double(input.getText().toString()) * 3;
 			bigBTeaspoonlb.setText(Double.toString(bigbloom)); 
 			double bigbloomOunce = bigbloom / 6; 
 			bigBOuncelb.setText(Double.toString(bigbloomOunce)); 

			double tigerbloom = new Double(input.getText().toString()) * 1;
			tigerBTeaspoonlb.setText(Double.toString(tigerbloom));
			double tigerOunce = tigerbloom / 6;
			tigerBOuncelb.setText(Double.toString(tigerOunce));
		
			double chaching = new Double(input.getText().toString()) * .25;
			chaCTeaspoonlb.setText(Double.toString(chaching));
			double chachingOunce = chaching / 6;
			chaCTablespoonlb.setText(Double.toString(chachingOunce));
		
 	    	growBTeaspoonlb.setText((""));
		    growBOuncelb.setText((""));

			openSTablespoonlb.setText((""));
			openSTeaspoonlb.setText((""));

			beastieBTablespoonlb.setText((""));
			beastieBTeaspoonlb.setText((""));
}			
			break;
	}

}
	
			@Override
			public void onPause() {
				super.onPause();
			
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

