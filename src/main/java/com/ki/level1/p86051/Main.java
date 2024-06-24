package com.ki.level1.p86051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
}

//numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        List<Integer> newArrayList = new ArrayList<Integer>();
        
        //number에 없는 값을 찾아서 ArrayList에 추가해야됨

        int answer = newArrayList.stream()
                .mapToInt(i -> i)
                .sum();

        System.out.println(newArrayList);

        return answer;
    }
}
