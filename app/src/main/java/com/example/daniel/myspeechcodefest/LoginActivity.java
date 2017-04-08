package com.example.daniel.myspeechcodefest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

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
    }
}
