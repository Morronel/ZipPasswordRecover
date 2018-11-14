package com.morronel;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    private Utils(){

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
