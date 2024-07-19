package com.ki.level0.p120812;

import java.util.HashMap;
import java.util.Map;

//가장 자주 나온 값 구하기
//여러개면 -1 리턴
class Solution {
    public int solution(int[] array) {

        if (array.length == 1) return array[0];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        int maxCounted = 0;
        int maxCount = 0;

        for (int i : map.keySet()) {
            if (map.get(i) > maxCounted) {
                maxCounted = i;
                maxCount = map.get(i);
            }
        }

        int dupCount = 0;

        for (int i : map.values()) {
            if (i == maxCount) dupCount++;
            if (dupCount > 1) return -1;
        }

        return maxCounted;
    }
}