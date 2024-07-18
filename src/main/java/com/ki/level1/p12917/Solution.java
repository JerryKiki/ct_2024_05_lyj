package com.ki.level1.p12917;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] ss = s.split("");
        Arrays.sort(ss, Collections.reverseOrder());

        return String.join("", ss);
    }
}