package com.ki.level0.p120811;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int center = array.length/2;
        int answer = array[center];
        return answer;
    }
}