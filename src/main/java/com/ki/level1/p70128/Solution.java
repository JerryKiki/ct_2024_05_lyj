package com.ki.level1.p70128;

//배열의 같은 위치의 값끼리 곱한 모든 수를 더한 값 리턴 (==내적)
class Solution {
    public int solution(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }

        int answer = 0;
        for (int i = 0; i < c.length; i++) {
            answer += c[i];
        }

        return answer;
    }
}