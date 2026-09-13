package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main_datapassing_intent extends AppCompatActivity {
    TextView welcomeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_datapassing_intent);
        welcomeText = findViewById(R.id.datapassing);

        String name = getIntent().getStringExtra("name");

        welcomeText.setText("Welcome, " + name + "!");
    }
}