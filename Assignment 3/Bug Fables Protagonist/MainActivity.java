package com.example.bugfablesprotagonists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String article = "com.example.bugfablesprotagonists.extra.article";
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent1 = new Intent(this, SecondActivity.class);
        mText = findViewById(R.id.article);
        String text = mText.getText().toString();
        intent1.putExtra(article, text);
        startActivity(intent1);
    }

    public void launchSecondActivityVi(View view) {
        Intent intent1 = new Intent(this, SecondActivity.class);
        mText = findViewById(R.id.article_Vi);
        String text = mText.getText().toString();
        intent1.putExtra(article, text);
        startActivity(intent1);
    }

    public void launchSecondActivityLeif(View view) {
        Intent intent1 = new Intent(this, SecondActivity.class);
        mText = findViewById(R.id.article_Leif);
        String text = mText.getText().toString();
        intent1.putExtra(article, text);
        startActivity(intent1);
    }
}