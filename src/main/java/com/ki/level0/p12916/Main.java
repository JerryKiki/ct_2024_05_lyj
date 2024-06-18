package com.ki.level0.p12916;

import java.util.Arrays;
import java.util.Objects;

public class Main {
}
class Solution {
    boolean solution(String s) {

        String[] input = s.split("");

        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i < input.length; i++) {
            if(input[i].equals("p") || input[i].equals("P")) {
                pCount++;
            } else if (input[i].equals("y") || input[i].equals("Y")) {
                yCount++;
            }
        }
        return pCount==yCount;
    }
}
