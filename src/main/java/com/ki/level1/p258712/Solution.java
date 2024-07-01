package com.ki.level1.p258712;

//이번 달 선물 기록 바탕으로 다음 달에 가장 많은 선물을 받을 사람이 받을 선물의 수 리턴
//서로 선물을 주고받았다면, 더 적게 준 놈이 더 많이 준 놈한테 하나 줌 (단순 주고받은 수 비교) => 이거 먼저 처리
//서로 주고받은 기록이 없거나 같다면, 전체적으로 많이 준 놈이 전체적으로 적게 준 놈한테 하나 받음 (선물지수) => 이후 처리
//만약 서로 선물지수도 같다면 (0==0도 포함) 주고받지 않는다.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//String[] friends = {"a", "b", "c"};
//String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};
class Solution {
    public int solution(String[] friends, String[] gifts) {

        //서로 비교

        Map<String, ArrayList<String>> interactions = new HashMap<>(); //사람 별로 누구한테 줬는지 기록하기 위한 해시맵
        Map<String, Integer> givePresent = new HashMap<>(); //사람 별로 준 사람을 기록하기 위한 해시맵
        Map<String, Integer> getPresent = new HashMap<>(); //사람 별로 받은 사람을 기록하기 위한 해시맵

        for (String name : friends) {
            ArrayList<String> nowPersonGivedTo = new ArrayList<>();
            int nowPersonGivePresent = 0;
            int nowPersonGetPresent = 0;
            for (String gift : gifts) {
                //String gived = name + " ";
                if (gift.contains(name + " ")) {
                    String[] nowFrineds = gift.split(" ");
                    nowPersonGivedTo.add(nowFrineds[1]);
                    nowPersonGivePresent++;
                }
                if (gift.contains(" " + name)) {
                    nowPersonGetPresent++;
                }
            }
            interactions.put(name, nowPersonGivedTo);
            givePresent.put(name, nowPersonGivePresent);
            getPresent.put(name, nowPersonGetPresent);
        }

        //주고받았는지를 먼저 검사 : a의 받은놈 arraylist에 b, c가 몇개 있는지 확인
        for (String givedName : interactions.keySet()) {
            for (String gotName : friends) {
                if (givedName.equals(gotName)) continue;
                if (interactions.get(givedName).contains(gotName)) {

                }
            }
        }


//        for (String name : friends) {
//            ArrayList<String> nowPersonGivedList = interactions.get(name);
//            for (String gotPerson : nowPersonGivedList) {
//                for (String nameCompare : friends) {
//                    if (nameCompare.equals(name)) continue;
//                    else if (gotPerson.equals(nameCompare)) {
//
//                    }
//                }
//            }
//        }

        return 0;
    }
}