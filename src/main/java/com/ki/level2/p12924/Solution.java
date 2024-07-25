package com.ki.level2.p12924;

import java.util.ArrayList;

//자연수 n을 연속한 자연수들로 표현 하는 방법은여러개
//예를들어 15는 다음과 같이 4가지로 표현
//1 + 2 + 3 + 4 + 5 = 15
//4 + 5 + 6 = 15
//7 + 8 = 15
//15 = 15
//자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return
//주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는
//주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있다.
class Solution {
    public int solution(int n) {

        if (n == 1) return 1;

        int count = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) count++;
        }

        return count;
    }
}
