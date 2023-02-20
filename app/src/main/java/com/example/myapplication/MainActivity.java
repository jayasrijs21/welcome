package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvDisp;
    EditText etName;
    Button btnAct1, btnAct2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        tvDisp = findViewById(R.id.tvDisp);
        btnAct1 = findViewById(R.id.btnAct1);
        btnAct2 = findViewById(R.id.btnAct2);
        final int ACTIVITY3 =3;

        btnAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etName.getText().toString().isEmpty() ) {
                    Toast.makeText(MainActivity.this, "please enter a name", Toast.LENGTH_SHORT).show();
                }
                else {
                    String name = etName.getText().toString();
                    Intent intent = new Intent(MainActivity.this , SecActivity.class);
                    intent.putExtra("pass" , name);
                    startActivity(intent);
                }




            }
        });
        /*btnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this , TriActivity.class);
                TriActivityResultLauncher.launch



            }
        });*/
    }
}