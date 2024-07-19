package com.ki.level0.p120863;

import java.util.ArrayList;
import java.util.List;

//같은 항끼리 계산, 미지수는 x만 있음
//더하기만 함
class Solution {
    public String solution(String polynomial) {
        String[] poly = polynomial.split(" ");

        List<Integer> withX = new ArrayList<>();
        List<Integer> normal = new ArrayList<>();

        for(String s : poly) {
            if (s.contains("x")) {
                int a;
                if (s.equals("x")) a = 1;
                else a = Integer.parseInt(s.replace("x", ""));
                withX.add(a);
            } else if (!s.contains("+") && !s.contains("x")) {
                normal.add(Integer.parseInt(s));
            }
        }

        int xSum = 0;
        int normalSum = 0;

        for (Integer i : withX) {
            xSum += i;
        }

        for (Integer i : normal) {
            normalSum += i;
        }

        String answer;

        if (xSum != 0 && normalSum != 0) {
            if (xSum == 1) answer = "x + " +normalSum;
            else answer = xSum + "x + " + normalSum;
        } else if (xSum != 0) {
            if (xSum == 1) answer = "x";
            else answer = xSum + "x";
        } else if (normalSum != 0) {
            answer = Integer.toString(normalSum);
        } else {
            answer = "0";
        }

        return answer;
    }
}
