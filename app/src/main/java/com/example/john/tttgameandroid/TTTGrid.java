package com.example.john.tttgameandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.RelativeLayout;


public class TTTGrid extends Activity {
    Button buttons[] = new Button[9];
    GridLayout gridLayout = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_tttgrid);
        RelativeLayout relativeLayout = (RelativeLayout) getLayoutInflater().inflate(R.layout.activity_hello, null);
        setContentView(relativeLayout);

        gridLayout = (GridLayout) findViewById(R.id.buttonContainer);
        for(int i=0; i<9; i++){
            Button b = new Button(this);
            b.setBackgroundResource(R.drawable.gradient_button);
            b.setText(""+i);
            gridLayout.addView(b);

            buttons[i] = b;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tttgrid, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
