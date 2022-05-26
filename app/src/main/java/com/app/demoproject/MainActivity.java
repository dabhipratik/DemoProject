package com.app.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.mylibrary.Demo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Demo.simpleToast(this,"Click Success");


    }
}