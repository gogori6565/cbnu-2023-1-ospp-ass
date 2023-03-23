package com.cookandroid.mission_3week;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageview1, imageview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview1=findViewById(R.id.ImageView1);
        imageview2=findViewById(R.id.ImageView2);
    }

    public void ButtonClick(View view){
        switch (view.getId()){
            case R.id.Button1: //위 버튼
                imageview1.setImageResource(R.drawable.myphoto); //위에 사진 보임
                imageview2.setImageResource(0);
                break;
            case R.id.Button2: //아래 버튼
                imageview2.setImageResource(R.drawable.myphoto); //아래 사진 보임
                imageview1.setImageResource(0);
                break;
            default:
                break;
        }
    }
}