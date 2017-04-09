package com.example.daniel.myspeechcodefest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by Ian on 4/8/2017.
 */

public class PracticeActivity extends AppCompatActivity{

    TextView wordText, practiceWord;
    Typeface tf2;
    int counter;
    int numberOfWords;
    String currentWord;
    ImageView wordImage;
    TextToSpeech speaker;
    Button nextButton, button, helpButton, exitButton, listenButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        WordManager.populateTroubleWords(User.getTroubleSounds());
        numberOfWords = WordManager.troubleWords.size();
        counter = 0;
        nextWord();

        speaker = new TextToSpeech(PracticeActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    speaker.setLanguage(Locale.US);
                }
            }
        });

        button = (Button)findViewById(R.id.button);
        listenButton = (Button)findViewById(R.id.listenButton);
        exitButton = (Button)findViewById(R.id.exitButton);
        nextButton = (Button)findViewById(R.id.nextButton);
        helpButton = (Button) findViewById(R.id.helpButton);
        practiceWord = (TextView)findViewById((R.id.practiceWord));
        tf2 = Typeface.createFromAsset(getAssets(), "Comfortaa-Light.ttf");
        practiceWord.setTypeface(tf2);
        button.setTypeface(tf2);
        exitButton.setTypeface(tf2);
        nextButton.setTypeface(tf2);
        helpButton.setTypeface(tf2);
        listenButton.setTypeface(tf2);

        Button nextWord = (Button) findViewById(R.id.nextButton);
        nextWord.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                nextWord();
            }
        });

        Button playWord = (Button) findViewById(R.id.listenButton);
        playWord.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(PracticeActivity.this, currentWord,Toast.LENGTH_SHORT).show();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    speaker.speak(currentWord,TextToSpeech.QUEUE_FLUSH,null,null);
                } else {
                    speaker.speak(currentWord, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
    }

    private void nextWord(){
        if(!WordManager.troubleWords.isEmpty()){
            currentWord = WordManager.troubleWords.get(counter);

            wordText = (TextView) findViewById(R.id.practiceWord);
            wordText.setText(WordManager.troubleWords.get(counter));

            wordImage = (ImageView) findViewById(R.id.practiceImage);
            wordImage.setImageResource(getID(WordManager.troubleWords.get(counter)));

            counter++;
            if(counter == WordManager.troubleWords.size()){
                Intent intent = new Intent(PracticeActivity.this,ProgressPage.class);
                startActivity(intent);
            }

        }

    }

    private int getID(String word) {
        return getResources().getIdentifier(word, "drawable", getPackageName());
        }
}
