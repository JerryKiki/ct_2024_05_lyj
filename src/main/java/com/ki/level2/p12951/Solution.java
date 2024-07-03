package com.ki.level2.p12951;

import java.util.Arrays;

class Solution {
    public String solution(String s) {

        String[] bits = s.split("");
        bits[0] = toUpper(bits[0]);

        //대문자 치환
        for (int i = 1; i < bits.length; i++) {
            if (bits[i].equals(" ") && i != bits.length - 1) { //내가 공백인데 마지막 글자가 아니면
                if(!bits[i + 1].equals(" ")) bits[i + 1] = toUpper(bits[i + 1]); //뒷글자가 공백이 아니라면 어퍼
            } else if (!bits[i].equals(" ") && !bits[i - 1].equals(" ")) { //내가 공백이 아니고 앞도 공백이 아니면
                bits[i] = toLower(bits[i]);
            }
        }

        System.out.println(String.join("", bits));
        return String.join("", bits);
    }

    public static String toUpper(String s) {
        char first = s.charAt(0);
        if (first >= 97) {
            String Upper = Character.toString(Character.toUpperCase(first));
            s = s.replace(first, Upper.charAt(0));
        }
        return s;
    }

    public static String toLower(String s) {
        char first = s.charAt(0);
        if (first >= 65 && first <= 90) {
            String Lower = Character.toString(Character.toLowerCase(first));
            s = s.replace(first, Lower.charAt(0));
        }
        return s;
    }
}