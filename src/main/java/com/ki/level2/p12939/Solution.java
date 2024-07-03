package com.ki.level2.p12939;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] inputs = s.split(" ");
        int[] numbers = Arrays.stream(inputs).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);

        return Integer.toString(numbers[0]) + " " + Integer.toString(numbers[numbers.length-1]);
    }
}
