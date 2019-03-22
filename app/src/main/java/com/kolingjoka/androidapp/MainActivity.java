package com.kolingjoka.androidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnClick);
        button.setOnClickListener(MainActivity.this);
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();
    }
}
