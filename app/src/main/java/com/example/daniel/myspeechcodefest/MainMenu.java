package com.example.daniel.myspeechcodefest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    Typeface tf3;
    Button mmExit, mmSelect, mmPractice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Button advanceToRegistrationPage = (Button) findViewById(R.id.mmPractice);
        advanceToRegistrationPage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainMenu.this,ProgressPage.class);
                startActivity(intent);
            }
        });


        mmPractice = (Button) findViewById(R.id.mmPractice);

        tf3 = Typeface.createFromAsset(getAssets(), "Comfortaa-Bold.ttf");

        mmPractice.setTypeface(tf3);

    }

}
