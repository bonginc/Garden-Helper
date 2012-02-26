package com.bonginc.gardenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.EditText;
import android.widget.RadioButton;

public class weight extends Activity {

	public TextView tv;
	public Button enter, clear;
	public EditText input;
	public RadioButton pound, ounce, halfoz;

	@Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.weight);

		tv = (TextView)findViewById(R.id.tv);
		clear = (Button)findViewById(R.id.clear);	
		enter = (Button)findViewById(R.id.enter);
		input = (EditText) findViewById(R.id.input); 
 		final RadioButton pound = (RadioButton) findViewById(R.id.pound);
		final RadioButton ounce = (RadioButton) findViewById(R.id.ounce);
		final RadioButton halfoz = (RadioButton) findViewById(R.id.halfoz);

	clear.setOnClickListener(new OnClickListener() {

		public void onClick(View v) {

 			input.setText("");	
			tv.setText("");
}
});
	enter.setOnClickListener(new OnClickListener() {

	public void onClick(View v) {

			if (pound.isChecked()==true) {
				double result = new Double(input.getText().toString()) / 453;
	 	        tv.setText(Double.toString(result)); 
				result=0;
	}
			if (ounce.isChecked()==true) {
				double result1 = new Double(input.getText().toString()) / 28;
	 	        tv.setText(Double.toString(result1)); 
				result1=0;
	}
			if (halfoz.isChecked()==true) {
				double result2 = new Double(input.getText().toString()) / 14;
	 	        tv.setText(Double.toString(result2));
				result2=0;
	}
	


}
});
		
		}
			@Override
			public void onPause() {
				super.onPause();
				finish();
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

