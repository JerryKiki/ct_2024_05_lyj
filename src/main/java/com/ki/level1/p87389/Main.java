package com.ki.level1.p87389;

public class Main {
}

class Solution {
    public int solution(int n) {
        //n을 나눈 나머지가 1이 되는 자연수 중 가장 작은 수
        int answer = 0;
        for(int i = 1; i < n; i++) {
            if(n%i==1) {
                return i;
            }
        }
        return n-1;
    }
}