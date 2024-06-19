package com.ki.level1.p12932;

public class Main {
}

class Solution {
    //입력된 값의 자리수들 뒤집어서 배열로 출력
    public int[] solution(long n) {

        String s = Long.toString(n);
        String[] array = s.split("");
        int[] answer = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            answer[i] = Integer.parseInt(array[array.length - 1 - i]);
        }

        return answer;
    }
}
