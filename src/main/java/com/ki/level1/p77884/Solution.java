package com.ki.level1.p77884;

import java.util.HashMap;
import java.util.Map;

//left부터 right까지 약수의 개수가 짝수인 수는 더하고 홀수인 수는 빼서 return
class Solution {
    public int solution(int left, int right) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = left; i <= right; i++) {
            if (i==1) { //1은 예외처리
                map.put(i, 1);
                continue;
            }
            int divisorCount = 2; //1외에는 1, 자기 자신 기본적으로 가짐
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            map.put(i, divisorCount);
        }

        int sum = 0;
        for(int key : map.keySet()) {
            if(map.get(key)%2 == 0) {
                sum += key;
            }
            else {
                sum -= key;
            }
        }
        return sum;
    }
}