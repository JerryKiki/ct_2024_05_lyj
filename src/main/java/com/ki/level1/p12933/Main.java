package com.ki.level1.p12933;

import java.util.Arrays;

public class Main {
}

class Solution {
    public long solution(long n) {
        //들어온 수의 요소들을 내림차수 정렬한 수 리턴
        String s = Long.toString(n);
        String[] array = s.split("");
        Arrays.sort(array);
        long answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                answer += (long) Long.parseLong(array[i]);
            } else {
                answer += (long) (Long.parseLong(array[i]) * Math.pow(10, i));
            }
        }
        return answer;
    }
}