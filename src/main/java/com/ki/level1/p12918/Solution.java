package com.ki.level1.p12918;

//길이가 4, 6이고 모두 숫자일 때만 true
class Solution {
    public boolean solution(String s) {
        if (!(s.length() == 4 || s.length() == 6)) return false;

        String[] ss = s.split("");

        for (int i = 0; i < ss.length; i++) {
            try {
                Integer.parseInt(ss[i]);
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }
}
