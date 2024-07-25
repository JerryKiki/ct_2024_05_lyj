package com.ki.level1.p12926;

class Solution {
    public String solution(String s, int n) {
        //A 65 Z 90 a 97 z 122
        char[] ch = s.toCharArray();

        for (int i = 0; i < n; i++) {
            ch[i] += n;
        }

        //z처리해야됨
        //형변환...

        return new String(ch);
    }
}