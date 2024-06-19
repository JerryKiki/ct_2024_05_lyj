package com.ki.level1.p12947;

public class Main {
}

class Solution {
    //인자값이 하샤드 수인지 판별
    //하샤드 수 : x의 자리수끼리 더한 값으로 x가 나누어지는가?
    public boolean solution(int x) {

        String[] array = Integer.toString(x).split("");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Integer.parseInt(array[i]);
        }

        return x%sum == 0;
    }
}