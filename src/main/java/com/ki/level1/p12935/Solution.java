package com.ki.level1.p12935;

import java.util.Arrays;

import static java.util.Arrays.*;

//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수
//단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴
class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 1) return new int[] {-1};

        int getMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (getMin > arr[i]) {
                getMin = arr[i];
            }
        }

        int finalGetMin = getMin;
        int[] answer = stream(arr)
                .filter(e -> e > finalGetMin)
                .toArray();

        return answer;
    }
}
