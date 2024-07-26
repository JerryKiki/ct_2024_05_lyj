package com.ki.level1.p12926;

class Solution {
    public String solution(String s, int n) {
        //A 65 Z 90 a 97 z 122
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                int a = ch[i];
                if (a <= 90 && (a + n) > 90) {
                    a = a + n - 90 + 64;
                } else if (a >= 97 && a <= 122 && (a + n) > 122) {
                    a = a + n - 122 + 96;
                } else {
                    a = a + n;
                }
                ch[i] = (char) a;
            }
        }

        return new String(ch);
    }
}