package com.cookandroid.project6_3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Chronometer chr;
    RadioButton rdoCal,rdoTime;
    TimePicker tPicker;
    DatePicker datePicker;
    TextView Year, Month, Day,Hour, Minute;

    int selectYear,selectMonth,selectDay;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간 예약(수정)");


        chr = (Chronometer) findViewById(R.id.chronometer1);

        rdoCal = (RadioButton) findViewById(R.id.rdoCal);
        rdoTime = (RadioButton) findViewById(R.id.rdoTime);

        tPicker = (TimePicker) findViewById(R.id.time);
        datePicker = (DatePicker)findViewById(R.id.date);

        Year = (TextView) findViewById(R.id.Year);
        Month = (TextView) findViewById(R.id.Month);
        Day = (TextView) findViewById(R.id.Day);
        Hour = (TextView) findViewById(R.id.Hour);
        Minute = (TextView) findViewById(R.id.Minute);

        tPicker.setVisibility(View.INVISIBLE);
        datePicker.setVisibility(View.INVISIBLE);
        rdoCal.setVisibility(View.INVISIBLE);
        rdoTime.setVisibility(View.INVISIBLE);

        Year.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                chr.stop();
                chr.setTextColor(Color.BLUE);
                Year.setText(Integer.toString(selectYear) + "년 ");
                Month.setText(Integer.toString(selectMonth) +"월 ");
                Day.setText(Integer.toString(selectDay) +"일 ");
                Hour.setText(Integer.toString(tPicker.getCurrentHour()) + "시 ");
                Minute.setText(Integer.toString(tPicker.getCurrentMinute()) + "분");
                rdoCal.setVisibility(View.INVISIBLE);
                rdoTime.setVisibility(View.INVISIBLE);
                datePicker.setVisibility(View.INVISIBLE);
                tPicker.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        chr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rdoCal.setVisibility(View.VISIBLE);
                rdoTime.setVisibility(View.VISIBLE);
                chr.setBase(SystemClock.elapsedRealtime());
                chr.start();
                chr.setTextColor(Color.RED);
            }
        });

        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tPicker.setVisibility(View.VISIBLE);
                datePicker.setVisibility(View.INVISIBLE);
            }
        });

        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tPicker.setVisibility(View.INVISIBLE);
                datePicker.setVisibility(View.VISIBLE);
            }
        });

        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                selectYear = year;
                selectMonth = monthOfYear + 1;
                selectDay = dayOfMonth;
            }
        });

        chr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rdoCal.setVisibility(View.VISIBLE);
                rdoTime.setVisibility(View.VISIBLE);
                chr.setBase(SystemClock.elapsedRealtime());
                chr.start();
                chr.setTextColor(Color.RED);
            }
        });

        Year.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                chr.stop();
                chr.setTextColor(Color.BLUE);
                Year.setText(Integer.toString(selectYear) + "년 ");
                Month.setText(Integer.toString(selectMonth) +"월 ");
                Day.setText(Integer.toString(selectDay) +"일 ");
                Hour.setText(Integer.toString(tPicker.getCurrentHour()) + "시 ");
                Minute.setText(Integer.toString(tPicker.getCurrentMinute()) + "분");
                rdoCal.setVisibility(View.INVISIBLE);
                rdoTime.setVisibility(View.INVISIBLE);
                datePicker.setVisibility(View.INVISIBLE);
                tPicker.setVisibility(View.INVISIBLE);
                return false;
            }
        });
    }
}