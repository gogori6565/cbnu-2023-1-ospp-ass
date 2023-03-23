package com.cookandroid.project4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //각각 import 해주기 -> ALT+ENTER 누르면 자동 import
    TextView text1, text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoQ, rdoR, rdoS;
    Button Btn1, Btn2;
    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1=(TextView) findViewById(R.id.Text1);
        chkAgree=(Switch) findViewById(R.id.ChkAgree);

        text2=(TextView) findViewById(R.id.Text2);
        rGroup1=(RadioGroup) findViewById(R.id.Rgroup1);
        rdoQ=(RadioButton) findViewById(R.id.RdoQ);
        rdoR=(RadioButton) findViewById(R.id.RdoR);
        rdoS=(RadioButton) findViewById(R.id.RdoS);

        Btn1=(Button) findViewById(R.id.Btn1);
        Btn2=(Button) findViewById(R.id.Btn2);
        imgAndroid=(ImageView) findViewById(R.id.ImgAndroid);

        //<시작함> 스위치를 체크/언체크 할 때 동작하는 리스너
        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()==true){ //체크되면
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    Btn1.setVisibility(android.view.View.VISIBLE);
                    Btn2.setVisibility(android.view.View.VISIBLE);
                    imgAndroid.setVisibility(android.view.View.VISIBLE);
                } else{ //체크해제되면
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    Btn1.setVisibility(android.view.View.INVISIBLE);
                    Btn2.setVisibility(android.view.View.INVISIBLE);
                    imgAndroid.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        //Rgroup1 에서 체크되는 라디오에 반응하는 리스너
        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoQ:
                        imgAndroid.setImageResource(R.drawable.androidq);
                        break;
                    case R.id.RdoR:
                        imgAndroid.setImageResource(R.drawable.androidr);
                        break;
                    case R.id.RdoS:
                        imgAndroid.setImageResource(R.drawable.androids);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"안드로이드 버전을 먼저 선택해주세요",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //종료 버튼 누를 시 앱 종료
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //처음으로 버튼 누를 시 초기화
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chkAgree.setChecked(false);
                rdoQ.setChecked(false);
                rdoR.setChecked(false);
                rdoS.setChecked(false);
                imgAndroid.setImageResource(0);
            }
        });
    }
}