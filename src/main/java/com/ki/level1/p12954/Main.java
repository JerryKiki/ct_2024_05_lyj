package com.ki.level1.p12954;

public class Main {
}

class Solution {
    public long[] solution(int x, int n) {
        //x부터 x씩 증가하는 n개의 배열 리턴

        long[] answer = new long[n];
        int now = x;

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x*(i+1);
        }

        return answer;
    }
}
