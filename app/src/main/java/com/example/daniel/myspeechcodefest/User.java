package com.example.daniel.myspeechcodefest;

import java.util.ArrayList;

/**
 * Created by Ian on 4/8/2017.
 */

public class User {
    private static ArrayList<String> troubleSounds;
    private static String username;
    private static  int starCount;

    public static void addStars(int newStars){
        starCount += newStars;
    }

    public static void addTroubleSound(String newTroubleSound){

        troubleSounds.add(newTroubleSound);
    }

    public static void setTroubleSounds(ArrayList<String> newTroubleSounds){
        troubleSounds = newTroubleSounds;
    }
    public static ArrayList<String> getTroubleSounds(){
        return troubleSounds;
    }
}
