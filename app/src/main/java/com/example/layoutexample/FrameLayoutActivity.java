package com.example.layoutexample;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Perkins on 1/20/2015.
 */
public class FrameLayoutActivity extends Activity {

    private boolean isGreen = false;
    private int Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
        Resources resources = this.getApplicationContext().getResources();
        Id = resources.getIdentifier("ic_launcher", "drawable", getPackageName());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.grid_layout, menu);
        return true;
    }

    public void doButton(View view) {
        FrameLayout ml = (FrameLayout) findViewById(R.id.FL);

        //how to get something from the drawable folder

        if (isGreen)
            ml.setBackgroundResource(Id);
        else
            ml.setBackgroundColor(0xFF00FF00);

        isGreen = !isGreen;
    }
}
