package com.ki.level0.p12921;

import static java.lang.Math.sqrt;

public class Main {
}

class Solution {
    public int solution(int n) {

        int count = 1;

        for (int i = 3; i <= n; i++) {
            if (isPrimeNumber(i)) count++;
        }

        return count;
    }

    public boolean isPrimeNumber(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
