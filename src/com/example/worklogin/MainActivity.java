package com.example.worklogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
		// Button1
        final Button btn1 = (Button) findViewById(R.id.button1);
        // Perform action on click
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	// Open Form 2
            	Intent newActivity = new Intent(MainActivity.this,ActivityForm2.class);
            	startActivity(newActivity);
        
            }
        });
        
	}

}