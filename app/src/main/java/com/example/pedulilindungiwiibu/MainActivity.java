package com.example.pedulilindungiwiibu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText namakamu, namahusbuWaifu;
    Button teskecocokan;
    TextView hasil, txtNama, txtHusbu;
    String namaorang, nama2d;
    String[] jawaban = {"dosa!!","ngga boleh halu","yang real masih banyak kamu ngga cocok sama yang gepenk ", " sadar diri"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namakamu = findViewById(R.id.namakamu_edittext);
        namahusbuWaifu = findViewById(R.id.namahsubu_edittext);
        teskecocokan = findViewById(R.id.testkecocokan_button);
        hasil = findViewById(R.id.hasil_textview);
        txtNama = findViewById(R.id.txtNama);
        txtHusbu = findViewById(R.id.txthusbu);

        Typeface font1=Typeface.createFromAsset(getAssets(),"font/JosefinSans-SemiBold.ttf");
        txtHusbu.setTypeface(font1);
        txtNama.setTypeface(font1);


        teskecocokan.setOnClickListener(view -> {
            namaorang = namakamu.getText().toString();
            nama2d = namahusbuWaifu.getText().toString();

            if (namaorang.isEmpty() && nama2d.isEmpty()){
                Toast.makeText(MainActivity.this, "isi dulu kolomnya dong!!", Toast.LENGTH_SHORT).show();
                hasil.setText(" ");
            }else if (namaorang.isEmpty()){
                Toast.makeText(MainActivity.this, "masukkan nama mu", Toast.LENGTH_SHORT).show();
                hasil.setText(" ");
            }else if (nama2d.isEmpty()){
                Toast.makeText(MainActivity.this, "masukkan nama husbu/waifumu", Toast.LENGTH_SHORT).show();
                hasil.setText(" ");
            }else {
                Random random = new Random();
                int r = random.nextInt(jawaban.length);

                hasil.setText(jawaban[r]);
            }
        });

    }
}