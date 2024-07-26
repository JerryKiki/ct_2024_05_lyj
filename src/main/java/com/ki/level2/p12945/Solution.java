package com.ki.level2.p12945;

//n번째 피보나치수를 1234567로 나눈 나머지 return
//참고: 나누는 이유는 int형 안의 범위에 있게 해주기 위해서라고함
class Solution {
    public int solution(int n) {

        int[] p = new int[n+1];
        p[0] = 0 % 1234567;
        p[1] = 1 % 1234567;
        for (int i = 2; i <= n; i++) {
            p[i] = (p[i - 1] + p[i - 2]) % 1234567;
        }

        return p[n] % 1234567;
    }
}