package com.guushamm.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class HelloWorldActivity extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	boolean rebelSwitchActivated = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);



		final Switch rebelSwitch = (Switch) findViewById(R.id.rebelSwitch);
		rebelSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				rebelSwitchActivated = isChecked;
			}
		});


		final Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (!rebelSwitchActivated){
					CharSequence text = "Hello World!";
					Toast toast = Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG);
					toast.show();
				}
				else {
					CharSequence text = "You are such a rebel";
					Toast toast = Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG);
					toast.show();
				}
			}
		});
	}
}
