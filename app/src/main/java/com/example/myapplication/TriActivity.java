package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TriActivity extends AppCompatActivity {

    TextView tvSur;
    Button btnSur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tri);

        tvSur = findViewById(R.id.tvSur);
        btnSur = findViewById(R.id.btnSur);
    }
}