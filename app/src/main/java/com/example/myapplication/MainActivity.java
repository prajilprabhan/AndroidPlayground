package com.example.myapplication;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button btn,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.personal1);
        btn2=findViewById(R.id.QA2);
        btn3=findViewById(R.id.toast3);
        btn4=findViewById(R.id.cal4);
        btn5=findViewById(R.id.date5);
            btn.setOnClickListener(v->{
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            });
        btn2.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, QuestionandAnswer.class);
            startActivity(intent);
        });
        btn3.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, ToastActivity.class);
            startActivity(intent);
        });
        btn4.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, Calculator.class);
            startActivity(intent);
        });
        btn5.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, Dateandtime.class);
            startActivity(intent);
        });


    }

}



