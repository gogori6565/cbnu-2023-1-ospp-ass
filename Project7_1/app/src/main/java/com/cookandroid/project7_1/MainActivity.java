package com.cookandroid.project7_1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText Angle;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("제주도 풍경");

        Angle=(EditText)findViewById(R.id.edtAngle);
        image=(ImageView) findViewById(R.id.imageView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemRotate:
                image.setRotation(Float.parseFloat((Angle.getText().toString())));
                return true;
            case R.id.item1:
                image.setImageResource(R.drawable.hanra);
                return true;
            case R.id.item2:
                image.setImageResource(R.drawable.chuja);
                return true;
            case R.id.item3:
                image.setImageResource(R.drawable.bum);
                return true;
        }
        return false;
    }

}