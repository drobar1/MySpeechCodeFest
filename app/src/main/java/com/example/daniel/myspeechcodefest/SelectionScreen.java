package com.example.daniel.myspeechcodefest;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
//Commit please
public class SelectionScreen extends AppCompatActivity {

    Typeface tf3;
    Button ssMainMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button advanceToMainMenu = (Button) findViewById(R.id.ssMainMenuButton);
        advanceToMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectionScreen.this,PracticeActivity.class);
                startActivity(intent);
            }

        });




        ssMainMenuButton = (Button) findViewById(R.id.ssMainMenuButton);
        tf3 = Typeface.createFromAsset(getAssets(), "Comfortaa-Light.ttf");
        ssMainMenuButton.setTypeface(tf3);

        final Button buttonToPractice = (Button) findViewById(R.id.buttonR);
        buttonToPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                buttonToPractice.setBackgroundColor(Color.BLUE);
            }
        });
        final Button buttonToPractice2 = (Button) findViewById(R.id.buttonCh);
        buttonToPractice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                buttonToPractice2.setBackgroundColor(Color.BLUE);
            }
        });
        final Button buttonToPractice3 = (Button) findViewById(R.id.buttonS);
        buttonToPractice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                buttonToPractice3.setBackgroundColor(Color.BLUE);
            }
        });
        final Button buttonToPractice4 = (Button) findViewById(R.id.buttonS);
        buttonToPractice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                buttonToPractice3.setBackgroundColor(Color.BLUE);
            }
        });
    }
}
