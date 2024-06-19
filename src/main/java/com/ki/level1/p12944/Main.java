package com.ki.level1.p12944;

public class Main {
}

class Solution {
    //배열의 평균값
    public double solution(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}