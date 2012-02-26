package com.bonginc.gardenhelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.view.MenuInflater;

public class intro extends Activity implements View.OnClickListener {

	Button timer,nutecalc,weight;

	@Override
	public void onCreate(Bundle porno) {
		super.onCreate(porno);
		setContentView(R.layout.intro);
		buttonSetup();
		onclickSetup();
}
	private void buttonSetup(){
		nutecalc=(Button)findViewById(R.id.nutecalc);
		timer=(Button)findViewById(R.id.timer);
		weight=(Button)findViewById(R.id.weight);
}
	private void onclickSetup(){
		nutecalc.setOnClickListener(this); 
		timer.setOnClickListener(this);
		weight.setOnClickListener(this); 
}
	public void onClick(View view) {
		switch(view.getId()){
		case R.id.timer:
			Intent timer = new Intent(intro.this, timer.class);
			startActivity(timer);
		break;
		case R.id.nutecalc:
			Intent nutecalc = new Intent(intro.this, nutecalc.class);
			startActivity(nutecalc);
		break;
		case R.id.weight:
			Intent weight = new Intent(intro.this, weight.class);
			startActivity(weight);
		break;	
	}
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.quit:
				finish();//quit();
			return true;
		default:
	return 
		super.onOptionsItemSelected(item);
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
			
		}
	}

