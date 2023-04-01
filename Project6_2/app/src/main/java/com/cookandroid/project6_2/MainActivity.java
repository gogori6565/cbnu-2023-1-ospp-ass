package com.cookandroid.project6_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Start, Stop;
        final ViewFlipper viewFlipper;

        Start = findViewById(R.id.btnStart);
        Stop = findViewById(R.id.btnStop);
        viewFlipper = findViewById(R.id.viewFlipper);
        viewFlipper.setFlipInterval(1000);

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.startFlipping();
            }
        });
        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.stopFlipping();
            }
        });
    }
}