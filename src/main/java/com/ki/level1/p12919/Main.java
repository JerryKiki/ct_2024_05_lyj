package com.ki.level1.p12919;

public class Main {
}

class Solution {
    public String solution(String[] seoul) {
        int numberOfKim = 0;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) { //스트링은 == 말고 .equals 써주는 게 안전!
                numberOfKim = i;
            }
        }
        return "김서방은 " + Integer.toString(numberOfKim) + "에 있다";
    }
}