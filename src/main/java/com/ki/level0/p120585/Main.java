package com.ki.level0.p120585;

public class Main {
}

class Solution {
    public int solution(int[] array, int height) {
        int tallerThanMe = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                tallerThanMe++;
            }
        }
        return tallerThanMe;
    }
}