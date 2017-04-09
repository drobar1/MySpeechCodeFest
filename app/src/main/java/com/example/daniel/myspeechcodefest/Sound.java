package com.example.daniel.myspeechcodefest;

import java.util.ArrayList;

/**
 * Created by Ian on 4/8/2017.
 */

public class Sound {
    public Sound(int newSoundId, String newSoundName){
        this.id = newSoundId;
        this.name = newSoundName;
    }
    private int id;
    private String name;
    private ArrayList<String> words;

    public int getID(){
        return id;
    }
    public void setID(int newId){
        this.id = newId;
    }
    public void addWord(String newWord){
        this.words.add(newWord);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
