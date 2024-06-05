package com.ki.level0.p120583;

public class Main {
}

class Solution {
    public int solution(int[] array, int n) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                num++;
            }
        }
        return num;
    }
}
