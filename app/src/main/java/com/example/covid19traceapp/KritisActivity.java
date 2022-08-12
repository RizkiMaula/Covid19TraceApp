package com.example.covid19traceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class KritisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kritis);
        getSupportActionBar().setTitle("Gejala Krisis");
    }
}