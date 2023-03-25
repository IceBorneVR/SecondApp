package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    // 변수 선언
    Button button1;
    CheckBox check1;

    // 앱 시작 후 가장 먼저 로딩디는 부분
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // activity_main.xml 에서 생성했던 객체와 연결
        button1 = (Button) findViewById(R.id.button1);
        check1 = (CheckBox) findViewById(R.id.check1);

        // 버튼 클릭시 동작할 이벤트
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // 팝업 메세지로 출력
                Toast.makeText(getApplicationContext(),"발사 완료!", Toast.LENGTH_SHORT).show();
            }
        });

        // 체크박스 클릭시 동작할 이벤트
        check1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // 팝업 메세지로 출력
                Toast.makeText(getApplicationContext(),"안전 준비 완료!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}