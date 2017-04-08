package com.example.daniel.myspeechcodefest;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button advanceToRegistrationPage = (Button) findViewById(R.id.BackToLogin);
        advanceToRegistrationPage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        Button registrationToSelection = (Button) findViewById(R.id.RegisterDone);
        registrationToSelection.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(RegisterActivity.this,SelectionScreen.class);
                startActivity(intent);
            }
        });


    }
}
