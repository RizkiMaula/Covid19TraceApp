package com.example.covid19traceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GejalaRinganActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala_ringan);
        getSupportActionBar().setTitle("Gejala Ringan dan Tanpa gejala");
    }
}