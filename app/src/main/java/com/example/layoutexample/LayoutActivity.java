package com.example.layoutexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class LayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.activity_layout, menu);
	return true;
    }

	public void doLinear(View v) {
		Intent i = new Intent(getBaseContext(), LinearActivity.class);
		startActivity(i);
	}

	public void doRelative(View v) {
		Intent i = new Intent(getBaseContext(), RelativeActivity.class);
		startActivity(i);
	}

	public void doTable(View v) {
		Intent i = new Intent(getBaseContext(), TableActivity.class);
		startActivity(i);
	}

	public void doWeightGravity(View v) {
		Intent i = new Intent(getBaseContext(), WeightGravityActivity.class);
		startActivity(i);
	}
	public void doGridLayout(View v) {
		Intent i = new Intent(getBaseContext(), GridLayoutActivity.class);
		startActivity(i);
	}

    public void doFrame(View view) {
        Intent i = new Intent(this,FrameLayoutActivity.class);
        startActivity(i);
    }


}
