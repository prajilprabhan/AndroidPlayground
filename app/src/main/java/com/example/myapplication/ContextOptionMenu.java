package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextOptionMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_option_menu);
        Button contextbtn = findViewById(R.id.contextbtn);
        registerForContextMenu(contextbtn);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {

            int id = item.getItemId();

            if (id == R.id.action_search) {
                Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show();
                return true;
            }

            if (id == R.id.action_settings) {
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
                return true;
            }

            if (id == R.id.action_logout) {
                Toast.makeText(this, "Logout clicked", Toast.LENGTH_SHORT).show();
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add("Edit");
        menu.add("Delete");
        menu.add("View");
    }

    // Display Toast when clicked
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        Toast.makeText(this,
                item.getTitle() + " clicked",
                Toast.LENGTH_SHORT).show();

        return true;
    }
}