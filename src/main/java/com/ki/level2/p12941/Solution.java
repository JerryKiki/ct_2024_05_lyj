package com.ki.level2.p12941;


import java.util.Arrays;
import java.util.Collections;

//배열간의 요소끼리 곱한 최솟값 구하기
//A의 가장 큰놈 * B의 가장 작은놈... 순으로 최대한 중위값에 가깝게 연산해주면 됨
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;

        for (int i = 0, j = A.length - 1; i < A.length; i++, j--) {
            answer += A[i] * B[j];
        }

        return answer;
    }
}
