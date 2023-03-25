package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    // 버튼 선언
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // activity_main.xml 에서 생성했던 버튼과 연결
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            // 버튼 클릭시 동작할 이벤트
            @Override
            public void onClick(View view)
            {
                // 팝업 메세지로 출력
                Toast.makeText(getApplicationContext(),"발사 완료!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}