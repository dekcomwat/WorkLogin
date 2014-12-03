package com.example.worklogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityForm2 extends Activity  {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form2);
		
		// Button1
        final Button btn1 = (Button) findViewById(R.id.button1);
        // Perform action on click
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
            	// Open Form 3
            	Intent newActivity = new Intent(ActivityForm2.this,MainActivity.class);
            	startActivity(newActivity);
        
            }
        });
	
	}
    
}