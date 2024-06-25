package com.ki.level1.p12948;

//전화번호가 문자열 phone_number로 주어졌을 때,
// 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴

import java.util.Arrays;

class Solution {
    public static String solution(String phone_number) {
        String[] numbers = phone_number.split("");
        for (int i = 0; i < numbers.length - 4; i++) {
            numbers[i] = "*";
        }
        return String.join("", numbers);
    }
}
