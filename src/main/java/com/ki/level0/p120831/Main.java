package com.ki.level0.p120831;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Solution().solution(60));
//        System.out.println(new Solution().solution(100));
    }
}

//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(i%2==0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
