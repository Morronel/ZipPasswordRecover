package com.morronel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path;
        List<List<Character>> listOfLists = new ArrayList<>();
        List<Character> characterArrayList = new ArrayList<>();
        int cores = Runtime.getRuntime().availableProcessors();
        int step;

        path = "/home/uucyc/Desktop/gli.zip";

        //adding lowercase chars
        for (int i = 97; i < 123; i++) {
            characterArrayList.add((char) i);
        }

        //adding uppercase chars
        for (int i = 65; i < 91; i++) {
            characterArrayList.add((char) i);
        }

        //adding numbers
        for (int i = 48; i < 58; i++) {
            characterArrayList.add((char) i);
        }

        if (cores > characterArrayList.size()) {
            cores = characterArrayList.size();
        }

         listOfLists = Utils.splitArrayByThreadAmount(characterArrayList, 12);


    }
}
