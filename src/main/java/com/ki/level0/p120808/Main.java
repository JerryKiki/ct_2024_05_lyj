package com.ki.level0.p120808;

public class Main {
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int equalDenom;
        int numerSum;
        int divide;

        if (denom1 != denom2) {
            equalDenom = denom1 * denom2;
            numer1 = numer1 * denom2;
            numer2 = numer2 * denom1;
        }

        numerSum = numer1 + numer2;





        int[] answer = {};
        return answer;
    }
}
