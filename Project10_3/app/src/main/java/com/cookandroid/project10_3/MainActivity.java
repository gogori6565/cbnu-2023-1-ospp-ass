package com.cookandroid.project10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("액티비티 테스트 예제");
        android.util.Log.i("액티비티 테스트","onCreate()");

        Button btnDial = (Button) findViewById(R.id.btnDial);
        Button btnFinish = (Button) findViewById(R.id.btnFinish);

        btnDial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel: 010-1234-5678");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        btnFinish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        android.util.Log.i("액티비티 테스트","onDestrou()");
    }
}