package com.example.daniel.myspeechcodefest;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity
{

    TextView etEmail, etPassword;
    Typeface tf1, tf2, tf3, tf4, tf5;
    Button RegisterButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button advanceToRegistrationPage = (Button) findViewById(R.id.RegisterButton);
        advanceToRegistrationPage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        Button loginPageToSelectionScreen = (Button) findViewById(R.id.loginButton);
        loginPageToSelectionScreen.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view2){
                Intent intent2 = new Intent(LoginActivity.this,SelectionScreen.class);
                startActivity(intent2);
            }
        });

        RegisterButton = (Button) findViewById(R.id.RegisterButton);
        loginButton = (Button) findViewById(R.id.loginButton);


        etEmail = (TextView)findViewById((R.id.editText4));
        etPassword = (TextView)findViewById(R.id.etPassword);

        tf1 = Typeface.createFromAsset(getAssets(), "Adlanta.otf");
        tf2 = Typeface.createFromAsset(getAssets(), "Adlanta-Light.otf");
        tf3 = Typeface.createFromAsset(getAssets(), "Comfortaa-Bold.ttf");
        tf4 = Typeface.createFromAsset(getAssets(), "Comfortaa-Regular.ttf");
        tf5 = Typeface.createFromAsset(getAssets(), "Comfortaa-Light.ttf");


        etEmail.setTypeface(tf5);
        etPassword.setTypeface(tf5);
        RegisterButton.setTypeface(tf3);
        loginButton.setTypeface(tf3);

    }
}
