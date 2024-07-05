package com.ki.level0.p120846;

class Solution {
    public int solution(int n) {


        if (n <= 3) return 0;

        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j == 0) {
                    count++;
                }
                if (count >= 3) break;
            }
            if (count == 3) answer++;
        }

        return answer;
    }
}
