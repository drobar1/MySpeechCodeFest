package com.example.daniel.myspeechcodefest;

import java.util.ArrayList;

/**
 * Created by Ian on 4/8/2017.
 */

public class User {
    private ArrayList<String> troubleSounds;
    private String username;        

    public void setTroubleSounds(ArrayList<String> newTroubleSounds){
        this.troubleSounds = newTroubleSounds;
    }
    public ArrayList<String> getTroubleSounds(){
        return this.troubleSounds;
    }
}
