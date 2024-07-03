package com.ki.level2.p12909;

class Solution {
    boolean solution(String s) {

        String[] brackets = s.split("");
        int bracketCount = 0;

        if (brackets[0].equals(")") || brackets[brackets.length - 1].equals("(")) {
            return false;
        } else {
            for (int i = 0; i < brackets.length; i++) {
                if (brackets[i].equals("(")) bracketCount++;
                else if (brackets[i].equals(")")) bracketCount--;
                if (bracketCount < 0) return false;
            }
        }

        return bracketCount == 0;
    }
}