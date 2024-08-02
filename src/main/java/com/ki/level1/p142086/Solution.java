package com.ki.level1.p142086;

//문자가 처음나왔으면 -1
//자기 n칸 앞에서 가장 가까운 같은 문자를 찾아서 n
//배열로 반환

import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) { //처음 나온 문자라면
                answer[i] = -1; //answer의 해당 인덱스에 -1
                map.put(s.charAt(i), i); //가장 최근 인덱스를 저장
            } else {
                answer[i] = i - map.get(s.charAt(i)); //현재 인덱스 - 가장 최근 인덱스
                map.put(s.charAt(i), i); //가장 최근 인덱스 덮어쓰기
            }
        }

        return answer;
    }
}
