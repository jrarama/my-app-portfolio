package com.example.joshua.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_spotify).setOnClickListener(this);
        findViewById(R.id.button_score).setOnClickListener(this);
        findViewById(R.id.button_bigger).setOnClickListener(this);
        findViewById(R.id.button_library).setOnClickListener(this);
        findViewById(R.id.button_reader).setOnClickListener(this);
        findViewById(R.id.button_capstone).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        String name = "";

        if (v instanceof Button) {
            // Get the button text
            name = ((Button) v).getText().toString();

            // Remove the 'APP' or anything after :
            name = name.replaceAll("\\s*((APP).*|:.*)", "");
        }

        Toast toast = Toast.makeText(context, "This button will launch my " + name + " app!", duration);
        toast.show();
    }
}
