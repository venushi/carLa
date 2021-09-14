package com.example.coursework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void carMake(View view) {
        Intent intent = new Intent(MainActivity.this, CarMake.class);
        startActivity(intent);
    }

    public void hints(View view) {
        Intent intent = new Intent(MainActivity.this, Hints.class);
        startActivity(intent);
    }

    public void carImage(View view) {
        Intent intent = new Intent(MainActivity.this, CarImage.class);
        startActivity(intent);
    }

    public void advanced(View view) {
        Intent intent = new Intent(MainActivity.this, Advanced.class);
        startActivity(intent);
    }
}