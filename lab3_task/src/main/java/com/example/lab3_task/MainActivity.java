package com.example.lab3_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab3_task.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView;
    private String[] messages;
    private int currentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        Button buttonNext = findViewById(R.id.btn_next);
        Button buttonPrev = findViewById(R.id.btn_back);

        messages = new String[] { "Message 1", "Message 2", "Message 3" };

        buttonNext.setOnClickListener(this);
        buttonPrev.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_back) {
            currentIndex = (currentIndex - 1 + messages.length) % messages.length;
            textView.setText(messages[currentIndex]);
            Toast.makeText(MainActivity.this, R.string.msg_back, Toast.LENGTH_SHORT).show();
        }

        if(v.getId() == R.id.btn_next) {
            currentIndex = (currentIndex + 1) % messages.length;
            textView.setText(messages[currentIndex]);
            Toast.makeText(MainActivity.this, R.string.msg_back, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.about_program) {
            Intent intent = new Intent(this, AboutProgramActivity.class);
            startActivity(intent);
        }

        if(item.getItemId() == R.id.about_author) {
            Intent intent = new Intent(this, AboutAuthorActivity.class);
            startActivity(intent);
        }

        if(item.getItemId() == R.id.exit) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}