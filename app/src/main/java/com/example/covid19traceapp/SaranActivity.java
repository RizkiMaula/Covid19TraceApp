package com.example.covid19traceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SaranActivity extends AppCompatActivity {
    private CardView ringan, sedang, berat, kritis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saran);
        getSupportActionBar().setTitle("Saran");

        ringan = findViewById(R.id.ringan);
        sedang = findViewById(R.id.sedang);
        berat = findViewById(R.id.berat);
        kritis = findViewById(R.id.kritis);

        ringan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GejalaRinganActivity.class));
            }
        });

        sedang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GejalaSedangActivity.class));
            }
        });

        berat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GejalaBeratActivity.class));
            }
        });

        kritis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), KritisActivity.class));
            }
        });


    }
}