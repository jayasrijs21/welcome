package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {
    TextView tvWelcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        tvWelcome= findViewById(R.id.tvWelcome);

        String name = getIntent().getStringExtra("pass");
        tvWelcome.setText(name + ", Welcome to 2nd activity");

    }


}