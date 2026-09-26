package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SharedPrefence extends AppCompatActivity {

    EditText username, password;
    Button savebtn, loadbtn;
    TextView displayData;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_prefence);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        savebtn = findViewById(R.id.savebtn);
        loadbtn = findViewById(R.id.loadbtn);

        displayData = findViewById(R.id.displayData);

        sharedPreferences = getSharedPreferences(
                "MyPrefs",
                MODE_PRIVATE
        );

        // Save data
        savebtn.setOnClickListener(view -> {

            String user = username.getText().toString();
            String pass = password.getText().toString();

            SharedPreferences.Editor editor =
                    sharedPreferences.edit();

            editor.putString("username", user);
            editor.putString("password", pass);
            editor.apply();

            displayData.setText(
                    "Username: " + user +
                            "\nPassword: " + pass
            );

            Toast.makeText(
                    SharedPrefence.this,
                    "Data saved successfully",
                    Toast.LENGTH_SHORT
            ).show();
        });

        // Load data
        loadbtn.setOnClickListener(view -> {

            String user = sharedPreferences.getString(
                    "username", ""
            );

            String pass = sharedPreferences.getString(
                    "password", ""
            );

            username.setText(user);
            password.setText(pass);

            displayData.setText(
                    "Username: " + user +
                            "\nPassword: " + pass
            );

            Toast.makeText(
                    SharedPrefence.this,
                    "Data loaded successfully",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}