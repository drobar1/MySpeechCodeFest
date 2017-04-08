package com.example.daniel.myspeechcodefest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerToLogin = (Button) findViewById(R.id.RegisterToLogin);
        registerToLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        Button buttonRegisterToSelection = (Button) findViewById(R.id.ButtonToSelection);
        buttonRegisterToSelection.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(RegisterActivity.this,SelectionScreen.class);
                startActivity(intent);
            }
        });
    }
}
