package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertMsg extends AppCompatActivity {

    Button alertbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_msg);

        alertbtn = findViewById(R.id.alertbtn);

        alertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlert();
            }
        });
    }

    public void showAlert() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Delete Confirmation");
        builder.setMessage("Are you sure you want to delete this item?");
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", (dialog, which) -> {
            Toast.makeText(AlertMsg.this,
                    "Item deleted successfully!",
                    Toast.LENGTH_SHORT).show();
        });

        builder.setNegativeButton("No", (dialog, which) -> {
            Toast.makeText(AlertMsg.this,
                    "Deletion cancelled",
                    Toast.LENGTH_SHORT).show();
        });

        builder.show();
    }
}