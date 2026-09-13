package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Data_passing_intent extends AppCompatActivity {
    EditText data;
    Button intentbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_passing_intent);
        data=findViewById(R.id.intentdata);
        intentbtn=findViewById(R.id.intentbtn);
        intentbtn.setOnClickListener(v -> {

            String name = data.getText().toString();

            Intent intent = new Intent(Data_passing_intent.this, Main_datapassing_intent.class);

            intent.putExtra("name", name);

            startActivity(intent);
        });
    }
}