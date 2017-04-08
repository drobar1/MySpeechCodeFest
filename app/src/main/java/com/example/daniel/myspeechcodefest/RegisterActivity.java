package com.example.daniel.myspeechcodefest;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView editText4, editText3, etUsername, etPassword, etCPassword;
    Typeface tf1, tf2, tf3, tf4, tf5;
    Button etRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editText4 = (TextView)findViewById((R.id.editText4));
        editText3 = (TextView)findViewById(R.id.editText3);
        etUsername = (TextView)findViewById(R.id.etUsername);
        etPassword = (TextView)findViewById(R.id.etPassword);
        etCPassword = (TextView)findViewById(R.id.etCPassword);

        etRegister = (Button)findViewById(R.id.etRegister);

        tf1 = Typeface.createFromAsset(getAssets(), "Adlanta.otf");
        tf2 = Typeface.createFromAsset(getAssets(), "Adlanta-Light.otf");
        tf3 = Typeface.createFromAsset(getAssets(), "Comfortaa-Bold.ttf");
        tf4 = Typeface.createFromAsset(getAssets(), "Comfortaa-Regular.ttf");
        tf5 = Typeface.createFromAsset(getAssets(), "Comfortaa-Light.ttf");

        editText4.setTypeface(tf5);
        editText3.setTypeface(tf5);
        etUsername.setTypeface(tf5);
        etPassword.setTypeface(tf5);
        etCPassword.setTypeface(tf5);
        etRegister.setTypeface(tf3);

    }
}
