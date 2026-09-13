package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ImplicitActivity extends AppCompatActivity {
    Button btnOpenUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        btnOpenUrl = findViewById(R.id.implicitbtn);

        // 1. Open Google (Implicit Intent: ACTION_VIEW)
        if (btnOpenUrl != null) {
            btnOpenUrl.setOnClickListener(v -> {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "No app found to handle web URL", Toast.LENGTH_SHORT).show();
                }
            });
        }


    }
}
