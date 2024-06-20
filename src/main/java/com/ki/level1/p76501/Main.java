package com.ki.level1.p76501;

public class Main {
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                absolutes[i] *= -1;
            }
        }

        int abSum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            abSum += absolutes[i];
        }

        return abSum;
    }
}
