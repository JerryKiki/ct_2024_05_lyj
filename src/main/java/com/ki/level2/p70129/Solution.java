package com.ki.level2.p70129;

import static java.lang.Long.toBinaryString;

//이진변환?
//0과 1로 이루어진 문자열 s
//1. s의 모든 0을 제거
//2. 제거하고 남은 s의 길이(10진수)를 이진법으로 변환
//s가 1이 될때까지 반복적으로 이진변환을 가함
//변환 횟수와 제거된 0의 개수를 담은 배열을 리턴
class Solution {
    public int[] solution(String s) {

        int zeroCount = 0;
        int changeCount = 0;

        while (!s.equals("1")) { //s가 1이 될 때까지 반복
            //제거 전, 이번 s의 0을 세어서 저장
            for(String str : s.split("")) {
                if(str.equals("0")) zeroCount++;
            }
            s = s.replaceAll("0", ""); //1. 0을 제거
            s = toBinaryString(s.length()); //2. 0 제거 후의 길이를 이진법으로 변환
            changeCount++;
        }

        return new int[] {changeCount, zeroCount};
    }
}
