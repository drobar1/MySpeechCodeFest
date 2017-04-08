package com.example.daniel.myspeechcodefest;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView editText4, editText3, etUsername, etPassword, etCPassword;
    Typeface tf1, tf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editText4 = (TextView)findViewById((R.id.editText4));
        editText3 = (TextView)findViewById(R.id.editText3);
        etUsername = (TextView)findViewById(R.id.etUsername);
        etPassword = (TextView)findViewById(R.id.etPassword);
        etCPassword = (TextView)findViewById(R.id.etCPassword);

        tf1 = Typeface.createFromAsset(getAssets(), "Adlanta.otf");
        tf2 = Typeface.createFromAsset(getAssets(), "Adlanta-Light.otf");

        editText4.setTypeface(tf1);
        editText3.setTypeface(tf1);
        etUsername.setTypeface(tf1);
        etPassword.setTypeface(tf1);
        etCPassword.setTypeface(tf1);


    }
}
