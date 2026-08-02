package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Dateandtime extends AppCompatActivity {
    TextView txt1,txt2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dateandtime);
        txt1=findViewById(R.id.txt2);
        txt2=findViewById(R.id.txt3);
        btn=findViewById(R.id.btn1);

        btn.setOnClickListener(v -> {

            Date date = new Date();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

            txt1.setText("Date :"+dateFormat.format(date));
            txt2.setText("Time :"+timeFormat.format(date));

        });

    }
}