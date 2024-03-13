package com.example.lab3_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class AboutProgramActivity extends AppCompatActivity {
    private CheckBox chb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_program);

        chb = findViewById(R.id.chb);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupVisible(R.id.group_additional, chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_program, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.back) {
            finish();
        }

        if(item.getItemId() == R.id.exit) {
            finishAffinity();
        }

        if(item.getItemId() == R.id.additional) {
            String toastSecret = getResources().getString(R.string.additional_info);
            Toast.makeText(this, toastSecret, Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}