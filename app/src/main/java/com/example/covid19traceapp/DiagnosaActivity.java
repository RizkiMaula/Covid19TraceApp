package com.example.covid19traceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class DiagnosaActivity extends AppCompatActivity {

    CheckBox checkSuhu, checkBatuk, checkSakitKepala,
             checkBadanLemah, checkHilangRasa, checkHilangBau,
             checkSakitTenggorokan, checkNyeriDada, checkDiare,
             checkNyeriBadan, checkIritasi, checkRuam, checkKelelahan,
             checkNafsuMakanHilang, checkNapasPendek, checkSesakNapas;

    Button btnDiagnosa;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        getSupportActionBar().setTitle("Diagnosa");

        checkSuhu = findViewById(R.id.suhu);
        checkBatuk = findViewById(R.id.batuk);
        checkSakitKepala = findViewById(R.id.sakitKepala);
        checkBadanLemah = findViewById(R.id.badanLemah);
        checkHilangRasa = findViewById(R.id.hilangRasa);
        checkHilangBau = findViewById(R.id.hilangBau);
        checkSakitTenggorokan = findViewById(R.id.sakitKepala);
        checkDiare = findViewById(R.id.diare);
        checkNyeriBadan = findViewById(R.id.nyeriBadan);
        checkIritasi = findViewById(R.id.iritasi);
        checkRuam = findViewById(R.id.ruam);
        checkKelelahan = findViewById(R.id.kelelahan);
        checkNafsuMakanHilang = findViewById(R.id.nafsuHilang);
        checkNapasPendek = findViewById(R.id.napasPendek);
        checkNyeriDada = findViewById(R.id.nyeriDada);
        checkSesakNapas = findViewById(R.id.sesak);

        btnDiagnosa = findViewById(R.id.btn_submit);
        tvResult = findViewById(R.id.tv_result);

        tvResult.setText("");

        btnDiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Diagnosa = "Kamu Kemungkinan terjangkit Covid Dengan Gejala\n";

                // Gejala Ringan
                if ((checkSuhu.isChecked() || checkKelelahan.isChecked()) && checkBatuk.isChecked() && checkNafsuMakanHilang.isChecked() &&
                        checkNapasPendek.isChecked()) {
                    Diagnosa += "Ringan";
                }

                // Gejala Sedang
                if ( (checkSuhu.isChecked() || ((checkSuhu.isChecked() || checkKelelahan.isChecked()) && checkBatuk.isChecked() && checkNafsuMakanHilang.isChecked() &&
                        checkNapasPendek.isChecked() && checkSesakNapas.isChecked())) && checkBatuk.isChecked() &checkSesakNapas.isChecked() ) {
                    Diagnosa += "Sedang";
                }

                // Gejala Berat
                if (checkSuhu.isChecked() && checkBatuk.isChecked() && checkSesakNapas.isChecked() && checkNyeriDada.isChecked() && checkNapasPendek.isChecked()) {
                    Diagnosa += "Berat";
                }

//                // Gejala Ringan
//                if ((checkSuhu.isChecked() || checkKelelahan.isChecked()) && checkBatuk.isChecked() && checkNafsuMakanHilang.isChecked() &&
//                        checkNapasPendek.isChecked()) {
//                    Diagnosa += "Ringan";
//                }

                tvResult.setText("" + Diagnosa);
            }
        });
    }

    public void onClickChecked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";

        switch (view.getId()) {
            case R.id.suhu:
                str = checked ? "Gejala Suhu > 38°C dipilih" : "Gejala Suhu > 38°C batal dipilih";
                break;

            case R.id.batuk:
                str = checked ? "Gejala Batuk dipilih" : "Gejala Batuk batal dipilih";
                break;

            case R.id.sesak:
                str = checked ? "Gejala sesak dipilih" : "Gejala sesak batal dipilih";
                break;

            case R.id.sakitKepala:
                str = checked ? "Gejala Sakit Kepala dipilih" : "Gejala Sakit Kepala batal dipilih";
                break;

            case R.id.badanLemah:
                str = checked ? "Gejala Badan Lemah dipilih" : "Gejala Badan Lemah batal dipilih";
                break;

            case R.id.hilangRasa:
                str = checked ? "Gejala Hilang Rasa dipilih" : "Gejala Hilang Rasa batal dipilih";
                break;

            case R.id.hilangBau:
                str = checked ? "Gejala Hilang Bau dipilih" : "Gejala Hilang Bau batal dipilih";
                break;

            case R.id.sakitTenggorokan:
                str = checked ? "Gejala Sakit Tenggorokan dipilih" : "Gejala Sakit Tenggorokan batal dipilih";
                break;

            case R.id.nyeriDada:
                str = checked ? "Gejala Nyeri Dada dipilih" : "Gejala Nyeri Dada batal dipilih";
                break;

            case R.id.diare:
                str = checked ? "Gejala diare dipilih" : "Gejala diare batal dipilih";
                break;

            case R.id.nyeriBadan:
                str = checked ? "Gejala nyeri Badan dipilih" : "Gejala Nyeri Badan batal dipilih";
                break;

            case R.id.iritasi:
                str = checked ? "Gejala iritasi" : "Gejala iritasi batal dipilih";
                break;

            case R.id.ruam:
                str = checked ? "Gejala ruam dipilih" : "Gejala ruam batal dipilih";
                break;

            case R.id.kelelahan:
                str = checked ? "Gejala kelelahan dipilih" : "Gejala kelelahan batal dipilih";
                break;

            case R.id.nafsuHilang:
                str = checked ? "Gejala Nafsu makan hilang dipilih" : "Gejala ruam nasfu makan hilang dipilih";
                break;

            case R.id.napasPendek:
                str = checked ? "Gejala Napas Pendek dipilih" : "Gejala Napas Pendek batal dipilih";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}