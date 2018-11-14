package com.morronel;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    private Utils(){

    }

    public static List<Character> characterListBuilder(){
        List<Character> characterArrayList = new ArrayList<>();

        //adding lowercase chars
        for (int i = 97; i < 123; i++) {
            characterArrayList.add((char) i);
        }

        //adding special symbols
        for (int i = 32; i < 48; i++) {
            characterArrayList.add((char) i);
        }

        for (int i = 58; i < 65; i++) {
            characterArrayList.add((char) i);
        }

        for (int i = 91; i < 96; i++) {
            characterArrayList.add((char) i);
        }

        for (int i = 123; i < 126; i++) {
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

        return characterArrayList;
    }

    public static List<Character> characterListBuilder(String params){
        List<Character> characterArrayList = new ArrayList<>();

        if (params.contains("-l") || params.contains("-c") || params.contains("-a")) {
            //adding lowercase chars
            for (int i = 97; i < 123; i++) {
                characterArrayList.add((char) i);
            }
        }

        if (params.contains("-l") || params.contains("-C") || params.contains("-a")) {
            //adding uppercase chars
            for (int i = 65; i < 91; i++) {
                characterArrayList.add((char) i);
            }
        }

        if (params.contains("-n") || params.contains("-a")) {
            //adding numbers
            for (int i = 48; i < 58; i++) {
                characterArrayList.add((char) i);
            }
        }

        if (params.contains("-s") || params.contains("-a")) {
            //adding special symbols
            for (int i = 32; i < 48; i++) {
                characterArrayList.add((char) i);
            }

            for (int i = 58; i < 65; i++) {
                characterArrayList.add((char) i);
            }

            for (int i = 91; i < 96; i++) {
                characterArrayList.add((char) i);
            }

            for (int i = 123; i < 126; i++) {
                characterArrayList.add((char) i);
            }
        }

        return characterArrayList;
    }

    public static List<List<Character>> splitArrayByThreadAmount(List<Character> origin, int threadCount){
        List<List<Character>> result = new ArrayList<>(threadCount);
        int len = origin.size();
        int step = len / threadCount;

        for (int i = 0; i < threadCount; i++) {
            List<Character> list = new ArrayList<Character>();
            for (int j = i * step; j < i * step + step; j++) {
                list.add(origin.get(j));
            }
            result.add(list);
        }

        //still have no idea, how this works
        if (len % threadCount != 0) {
            int ostatok = len% threadCount;
            for (int i = 0; i < ostatok; i++) {
                result.get(i).add(origin.get(i + threadCount * step));
            }
        }

        return result;
    }
}
