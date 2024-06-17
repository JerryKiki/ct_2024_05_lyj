package com.ki.level0.p120813;

public class Main {
}

class Solution {
    public int[] solution(int n) {
        int maxIndex;
        if (n%2 == 0) {
            maxIndex = n/2;
        } else maxIndex = n/2 + 1;

        int[] answer = new int[maxIndex];

        for (int i = 1, j = 0; i <= n; i++) {
            if(i%2 != 0) {
                answer[j] = i;
                j++;
            }
        }

        return answer;
    }
}
