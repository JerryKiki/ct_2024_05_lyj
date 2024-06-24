package com.ki.level1.p86051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
}

//numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return
class Solution {
    public int solution(int[] numbers) {
        List<Integer> newArrayList = new ArrayList<>();

        //number에 없는 값을 찾아서 ArrayList에 추가해야됨
        for(int i = 0; i <= 9; i++) {
            int finalI = i;
            if(!IntStream.of(numbers).anyMatch(x -> x == finalI)) {
                newArrayList.add(i);
            }
        }

        System.out.println(newArrayList);

        int answer = newArrayList.stream()
                .mapToInt(i -> i)
                .sum();

        return answer;
    }
}
