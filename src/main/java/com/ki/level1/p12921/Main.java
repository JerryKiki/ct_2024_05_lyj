package com.ki.level1.p12921;

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

        if (n == 1) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;

        for (int i = 3; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
