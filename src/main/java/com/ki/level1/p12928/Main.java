package com.ki.level1.p12928;

public class Main {
}

class Solution {
    public int solution(int n) {
        //n의 약수를 모두 더하기
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
