package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    Button btn;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        btn = findViewById(R.id.button);
        txt = findViewById(R.id.editText);

        btn.setOnClickListener(v -> {
            String enteredtxt = txt.getText().toString();
            Toast.makeText(this, enteredtxt, Toast.LENGTH_SHORT).show();
        });
    }
}