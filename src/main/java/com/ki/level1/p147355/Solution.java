package com.ki.level1.p147355;

import java.util.ArrayList;

//크기가 작은 부분 문자열
//t를 p만큼의 길이로 잘랐을 때 (하나하나) p보다 작은 수의 개수
//런타임 에러...
class Solution {
    public int solution(String t, String p) {
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            int lastSub = i + p.length();
            if (lastSub <= t.length()) {
                String tt = t.substring(i, lastSub);
                if (Long.parseLong(tt) <= Long.parseLong(p)) {
                    count++;
                }
            }
        }
        return count;
    }
}