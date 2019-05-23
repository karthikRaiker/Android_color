package com.example.exma3color;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        RelativeLayout relativeLayout = findViewById(R.id.relativelayout);
        switch (item.getItemId())
        {
            case R.id.red:
            {
                relativeLayout.setBackgroundColor(Color.RED);
                return true;
            }
            case R.id.green:
            {
                relativeLayout.setBackgroundColor(Color.GREEN);
                return true;
            }
            case R.id.blue:
            {
                relativeLayout.setBackgroundColor(Color.BLUE);
                return true;
            }
            default:
            {
                super.onOptionsItemSelected(item);
            }
        }
        return true;
    }
}
