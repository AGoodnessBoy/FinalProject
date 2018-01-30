package com.example.jokeandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainJokeLibActivity extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);
        textView = findViewById(R.id.text_lib_joke);
        Intent extra = getIntent();
        String joke = extra.getStringExtra("joke");
        textView.setText(joke);
    }
}
