package com.ki.level1.p12940;

import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int m) {

        int big = Math.max(n, m);
        int small = Math.min(n, m);

        int divisor = 0;
        int multiple = 0;

        //최대공약수
        //작은 쪽의 약수(큰 것부터)로 큰 쪽을 나눠보기 => 맨 첫값이 최대공약수
        for (int i = small; i >= 1; i--) {
            if (small % i == 0) { //작은 쪽의 약수면
                if (big % i == 0) {
                    divisor = i;
                    break;
                }
            }
        }

        //최소공배수
        //큰쪽을 키워가며 작은걸로 나눠지는지 보기
        int i = 1;
        while(true) {
            multiple = big * i;
            if (multiple % small == 0) {
                break;
            }
            i++;
        }

        return new int[] {divisor, multiple};
    }
}
