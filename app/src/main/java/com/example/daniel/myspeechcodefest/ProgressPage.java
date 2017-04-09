package com.example.daniel.myspeechcodefest;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProgressPage extends AppCompatActivity {

    TextView textView3, textView4, textView5;
    Typeface tf1, tf2, tf3, tf4, tf5;
    RatingBar ratingBar, ratingBar2, ratingBar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_page);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ratingBar.setRating(4);
        ratingBar2.setRating(2);
        ratingBar3.setRating(1);

        textView3 = (TextView)findViewById(R.id.textView3);
        textView4 = (TextView)findViewById(R.id.textView4);
        textView5 = (TextView)findViewById(R.id.practiceWord);

        tf1 = Typeface.createFromAsset(getAssets(), "Adlanta.otf");
        tf2 = Typeface.createFromAsset(getAssets(), "Adlanta-Light.otf");
        tf3 = Typeface.createFromAsset(getAssets(), "Comfortaa-Bold.ttf");
        tf4 = Typeface.createFromAsset(getAssets(), "Comfortaa-Regular.ttf");
        tf5 = Typeface.createFromAsset(getAssets(), "Comfortaa-Light.ttf");

        textView5.setTypeface(tf3);
        textView5.setTypeface(tf3);
        textView5.setTypeface(tf3);

    }

}
