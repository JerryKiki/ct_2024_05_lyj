package com.ki.level2.p12973;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(String s) {
        if (s.length() % 2 != 0) return 0;

        HashMap<String, ArrayList<Integer>> maps = new HashMap<>();
        String[] ss = s.split("");

        //일단 맵에 담는다 (철자, (인덱스리스트))
        for (int i = 0; i < ss.length; i++) {
            if (!maps.containsKey(ss[i])) {
                maps.put(ss[i], new ArrayList<>());
                maps.get(ss[i]).add(i);
            } else {
                maps.get(ss[i]).add(i);
            }
        }

        //철자별 개수 확인: 홀수 하나라도 있으면 불가
        for (String key : maps.keySet()) {
            if (maps.get(key).size() % 2 != 0) return 0;
        }

        return 1;
    }
}

//기존 푼 방식(시간초과...)
//        ArrayList<String> ss = new ArrayList<>(List.of(s.split("")));
//
//        int idx = 0;
//
//        while (!ss.isEmpty()) {
//            try {
//                if (ss.get(idx).equals(ss.get(idx + 1))) {
//                    ss.remove(idx);
//                    ss.remove(idx);
//                    idx = 0;
//                } else {
//                    idx++;
//                }
//            } catch (IndexOutOfBoundsException e) {
//                    break;
//                }
//            }
//
//        if (ss.isEmpty()) return 1;
//        else return 0;
