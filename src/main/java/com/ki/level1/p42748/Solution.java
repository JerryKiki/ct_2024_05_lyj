package com.ki.level1.p42748;

import java.util.Arrays;

//array를 i번부터 j번까지 잘라서 정렬한 배열의 k번째 수 (i, j, k는 2차원 배열로 여러번 주어짐)
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int from = commands[i][0] - 1;
            int to = commands[i][1] - 1;
            int value = commands[i][2] - 1;

            int[] array2 = new int[to-from+1];
            for (int j = 0; j < array2.length; j++) {
                array2[j] = array[from+j];
            }

            Arrays.sort(array2);

            answer[i] = array2[value];
        }

        return answer;
    }
}
