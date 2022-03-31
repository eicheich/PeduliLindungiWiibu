package com.example.pedulilindungiwiibu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText txtusername, txtpassword;
    Button btnLogin;
    TextView txtLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtusername = findViewById(R.id.txtusername);
        txtpassword = findViewById(R.id.txtpassword);
        btnLogin = findViewById(R.id.btnlogin);
        txtLogin = findViewById(R.id.txtLogin);

        Typeface font1=Typeface.createFromAsset(getAssets(),"font/JosefinSans-Bold.ttf");
        Typeface font2=Typeface.createFromAsset(getAssets(),"font/JosefinSans-SemiBold.ttf");
        txtLogin.setTypeface(font1);
        txtusername.setTypeface(font2);
        txtpassword.setTypeface(font2);

        btnLogin.setOnClickListener(v -> {

            String usernameKey = txtusername.getText().toString();
            String passwordKey = txtpassword.getText().toString();

            if (usernameKey.equals("rus") && passwordKey.equals("123")){
                Toast.makeText(getApplicationContext(), "Login Berhasil!",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
                LoginActivity.this.startActivity(intent);
                finish();
            }else {
                Toast.makeText(getApplicationContext(), "Username atau Password salah!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}