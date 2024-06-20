package com.ki.level1.p86051;

public class Main {
}

//numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) { //배열 훑기
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {

                }
            }
        }
        return answer;
    }
}
