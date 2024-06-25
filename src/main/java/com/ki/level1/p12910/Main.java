package com.ki.level1.p12910;

import java.util.Arrays;

public class Main {
}

//input된 arr중 divisor로 나누어 떨어지는 값들의 배열 반환, 없으면 -1
class Solution {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int newArrIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0) newArrIndex++;
        }
        if(newArrIndex==0) return new int[] {-1};

        int[] newArr = new int[newArrIndex];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0) {
                newArr[index] = arr[i];
                index++;
            }
        }

        Arrays.sort(newArr);

        return newArr;
    }
}