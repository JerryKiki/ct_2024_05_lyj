package com.ki.level1.p12912;

public class Main {
}

class Solution {
    public long solution(int a, int b) {
        //a와 b 사이의 모든 값을 더해서 리턴
        //같은 경우는 둘 중 아무거나, 대소관계 X
        int big = a;
        int small = b;
        long sum = 0;

        if (b > a) {
            big = b;
            small = a;
        }

        for (long i = small; i <= big; i++) {
            sum += i;
        }

        return sum;
    }
}
