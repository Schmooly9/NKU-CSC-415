package com.example.bugfablesprotagonists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.article);
        TextView textView = findViewById(R.id.article);
        textView.setText(text);
    }
}