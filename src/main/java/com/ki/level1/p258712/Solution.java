package com.ki.level1.p258712;

//이번 달 선물 기록 바탕으로 다음 달에 가장 많은 선물을 받을 사람이 받을 선물의 수 리턴
//서로 선물을 주고받았다면, 더 적게 준 놈이 더 많이 준 놈한테 하나 줌 (단순 주고받은 수 비교) => 이거 먼저 처리
//서로 주고받은 기록이 없거나 같다면, 전체적으로 많이 준 놈이 전체적으로 적게 준 놈한테 하나 받음 (선물지수) => 이후 처리
//만약 서로 선물지수도 같다면 (0==0도 포함) 주고받지 않는다.

import java.util.HashMap;
import java.util.Map;

//String[] friends = {"a", "b", "c"};
//String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};
class Solution {
    public int solution(String[] friends, String[] gifts) {

        //friends 만큼의 요소를 가지는 해시맵에, key는 이름, value 1, 2는 준 수 받은 수르 저장
        Map<String, Integer> myMap = new HashMap<String, Integer>();

        return 0;
    }
}