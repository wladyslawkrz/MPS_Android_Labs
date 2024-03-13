package com.example.lab2_events_src;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button buttonNext;
    private Button buttonPrev;
    private String[] messages;
    private int currentIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2_layout);

        textView = findViewById(R.id.text_view);
        buttonNext = findViewById(R.id.btn_next);
        buttonPrev = findViewById(R.id.btn_back);
        messages = new String[] { "Message 1", "Message 2", "Message 3" };

        buttonNext.setOnClickListener(v -> {
            currentIndex = (currentIndex + 1) % messages.length;
            textView.setText(messages[currentIndex]);
            Toast.makeText(MainActivity.this, "Click on Next", Toast.LENGTH_SHORT).show();
        });

        buttonPrev.setOnClickListener(v -> {
            currentIndex = (currentIndex - 1 + messages.length) % messages.length;
            textView.setText(messages[currentIndex]);
            Toast.makeText(MainActivity.this, "Click on Back", Toast.LENGTH_SHORT).show();
        });
    }
}