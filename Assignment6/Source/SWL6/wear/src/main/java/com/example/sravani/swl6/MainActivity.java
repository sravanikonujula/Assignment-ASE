package com.example.sravani.swl6;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button b = (Button) findViewById(R.id.bnav);
    b.setOnClickListener(new View.OnClickListener() {
    @Override

    public void onClick(View v) {
        Intent buttonIntent = new Intent(MainActivity.this,MapsActivity.class);
        MainActivity.this.startActivity(buttonIntent);

        }

    });


    }
}
