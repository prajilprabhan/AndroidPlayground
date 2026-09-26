package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn,btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8 , btn9,btn10,btn11,btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.helloworld);
        btn = findViewById(R.id.personal1);
        btn2 = findViewById(R.id.QA2);
        btn3 = findViewById(R.id.toast3);
        btn4 = findViewById(R.id.cal4);
        btn5 = findViewById(R.id.date5);
        btn6 = findViewById(R.id.lifecycle6);
        btn7 = findViewById(R.id.intent);
        btn8 = findViewById(R.id.explicitbtn);
        btn9 = findViewById(R.id.button3);
        btn10=findViewById(R.id.menu);
        btn11 = findViewById(R.id.mainalert);
        btn12=findViewById(R.id.sharedp);

        btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HelloWorld.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuestionandAnswer.class);
            startActivity(intent);
        });
        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ToastActivity.class);
            startActivity(intent);
        });
        btn4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Calculator.class);
            startActivity(intent);
        });
        btn5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Dateandtime.class);
            startActivity(intent);
        });
        btn6.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LifecycleActivity.class);
            startActivity(intent);
        });
        btn7.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImplicitActivity.class);
            startActivity(intent);
        });
        btn8.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ExplicitActivity.class);
            startActivity(intent);
        });
        btn9.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Data_passing_intent.class);
            startActivity(intent);
        });
        btn10.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContextOptionMenu.class);
            startActivity(intent);
        });
        btn11.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,AlertMsg.class);
            startActivity(intent);
        });
        btn12.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SharedPrefence.class);
            startActivity(intent);
        });
    }
}



