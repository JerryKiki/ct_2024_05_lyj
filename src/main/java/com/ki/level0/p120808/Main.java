package com.ki.level0.p120808;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        s.solution(999, 99, 999, 99);
    }
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int equalDenom = 0;
        int numerSum;

        if (denom1 != denom2) {
            equalDenom = denom1 * denom2;
            numer1 = numer1 * denom2;
            numer2 = numer2 * denom1;
        }
        else if (denom1 == denom2) {
            equalDenom = denom1;
        }

        numerSum = numer1 + numer2;
        System.out.println(numerSum);
        System.out.println(equalDenom);
        //이 위까지 약분 전의 분수

        int[] numerAr = divide(numerSum);
        int[] denomAr = divide(equalDenom);
        System.out.println(Arrays.toString(numerAr));
        System.out.println(Arrays.toString(denomAr));

        int rs = rs(numerAr, denomAr);
        System.out.println(rs);

        int[] answer = new int[] {numerSum/rs, equalDenom/rs};
        System.out.println(Arrays.toString(answer));

        return new int[] {numerSum/rs, equalDenom/rs};
    }

    //약수 구하기
    public int[] divide(int n) {
        //약수 개수 구하기
        int count = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        //약수 배열
        int[] array = new int[count];

        for (int i = 1, j = 0; i <= n; i++) {
            if (n % i == 0) {
                array[j] = i;
                j++;
            }
        }

        return array;
    }

    //공약수 구하기(배열에서 가장 큰 같은 수)
    public int rs(int[] numerSum, int[] equalDenom) {

        for (int i = equalDenom.length - 1; i >= 0; i--) {
            for (int j = numerSum.length - 1; j >= 0; j--) {
                if (equalDenom[i] == numerSum[j]) {
                    return numerSum[j];
                }
            }
        }
        return 1;
    }
}


