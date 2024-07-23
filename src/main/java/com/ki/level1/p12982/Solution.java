package com.ki.level1.p12982;

import java.util.Arrays;

//d만큼씩 예산신청했을 때 budget으로 지원해 줄 수 있는 부서의 '수'
//신청한만큼 다 못주면 아예 지원을 안한다.
class Solution {
    public int solution(int[] d, int budget) {
        //그냥 작은것부터 하면 되지 않을까?
        Arrays.sort(d);

        int answer = 0;
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget >= 0) {
                answer++;
            } else break;
        }

        return answer;
    }
}