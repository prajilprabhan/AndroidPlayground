package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ExplicitActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        btn1 = findViewById(R.id.profilebtn);
        btn2 = findViewById(R.id.qnabtn);
        btn3 = findViewById(R.id.calcbtn);

        // Explicit Intent to Profile (MainActivity2)
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(ExplicitActivity.this, MainActivity2.class);
            startActivity(intent);
        });

        // Explicit Intent to Q&A (QuestionandAnswer)
        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(ExplicitActivity.this, QuestionandAnswer.class);
            startActivity(intent);
        });

        // Explicit Intent to Calculator
        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(ExplicitActivity.this, Calculator.class);
            startActivity(intent);
        });


    }
}
