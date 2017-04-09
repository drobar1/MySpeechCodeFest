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
        tf3 = Typeface.createFromAsset(getAssets(), "Comfortaa-Bold.ttf");
        ssMainMenuButton.setTypeface(tf3);
    }
}
