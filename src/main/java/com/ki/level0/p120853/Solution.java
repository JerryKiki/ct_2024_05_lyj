package com.ki.level0.p120853;

//배열 내의 수를 모두 더하되 Z가 있으면 직전의 수는 제외한다.
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] add = s.split(" "); //공백으로 구분된 배열 생성

        for (int i = 0; i < add.length; i++) {
            if (!add[i].equals("Z")) { //i가 Z가 아니라면,
                if (i != add.length - 1) { // 1. 마지막 배열이 아니면
                    if (!add[i + 1].equals("Z")) { //다음 글자가 Z인지 확인, 아니라면 더함
                        answer = answer + Integer.parseInt(add[i]);
                    }
                } else if (i == add.length - 1) { // 2. 마지막 배열이면
                    answer = answer + Integer.parseInt(add[i]); //그냥 더함(Z체크는 이미 통과함)
                }
            }
        }

        return answer;
    }
}
