package com.example.covid19traceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GejalaSedangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala_sedang);
        getSupportActionBar().setTitle("Gejala Sedang");
    }
}