package com.ki.level1.p12931;

import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = Integer.toString(n);
        String[] array = s.split("");
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            answer += Integer.parseInt(array[i]);
        }
        return answer;
    }
}
