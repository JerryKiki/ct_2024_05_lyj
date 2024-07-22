package com.ki.level2.p12946;

import java.util.ArrayList;

//하노이의 탑, 기둥 3개, 옮기는 최단 '방법'을 2차원 배열로 return
class Solution {
    public int[][] solution(int n) {
        //기둥 별 list 준비
        ArrayList<Integer> column1 = new ArrayList<>();
        ArrayList<Integer> column2 = new ArrayList<>();
        ArrayList<Integer> column3 = new ArrayList<>();

        //블록 준비
        for (int i = 1; i <= n; i++) {
            column1.add(i);
        }

        //옮긴 역사
        ArrayList<int[]> movements = new ArrayList<>();









        int[][] answer = {};
        return answer;
    }
}
