package com.example.daniel.myspeechcodefest;

import java.util.ArrayList;


/**
 * Created by Ian on 4/8/2017.
 */

public class WordManager {

    static ArrayList<Sound> sounds = new ArrayList<Sound>();
    static ArrayList<String> troubleWords = new ArrayList<String>();

    public static void populateTroubleWords(ArrayList<String> troubleSounds){
        troubleWords.clear();
        if(troubleSounds != null)
            for (String soundName : troubleSounds) {
                ArrayList<String> words = getWordsWithSound(soundName);
                if(words != null)
                    for (String word : words) {
                        troubleWords.add(word);
                    }
            }
    }

    private static ArrayList<String> getWordsWithSound(String soundName){
        for (Sound sound : sounds) {
            if(sound.getName().equals(soundName)) {
                return sound.getWords();
            }
        }
        return null;
    }





}

