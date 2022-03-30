package com.example.pedulilindungiwiibu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {
    Button tombolmulai;
    TextView txtWelcome, txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tombolmulai = findViewById(R.id.start_btn);
        txtWelcome = findViewById(R.id.txtWelcome);
        txtDesc = findViewById(R.id.txtDesc);

        Typeface font1=Typeface.createFromAsset(getAssets(),"font/JosefinSans-Bold.ttf");
        Typeface font2=Typeface.createFromAsset(getAssets(),"font/JosefinSans-SemiBold.ttf");
        txtWelcome.setTypeface(font1);
        txtDesc.setTypeface(font2);

        tombolmulai.setOnClickListener(view -> {

            Toast.makeText(WelcomeActivity.this, "mulai!!", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(WelcomeActivity.this,MainActivity.class);
            startActivity(i);
        });

    }
}