package com.ki.level0.p120821;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] num_list = new int[]{1, 2, 3};
        int[] reverse = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            reverse[i] = num_list[num_list.length - i - 1];
            System.out.println(reverse[i]);
        }
    }
}

//문제 : 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
// num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++) {
            reverse[i] = num_list[num_list.length - i - 1];
        }
        return reverse;
    }
}
