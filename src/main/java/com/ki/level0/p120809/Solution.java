package com.ki.level0.p120809;

class Solution {
    public int[] solution(int[] numbers) {
        //배열 두배로 만들기
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
