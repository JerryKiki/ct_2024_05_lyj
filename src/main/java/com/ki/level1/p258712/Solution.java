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
        Map<String, Integer> givePresent = new HashMap<>(); //사람 별로 준 수를 기록하기 위한 해시맵
        Map<String, Integer> getPresent = new HashMap<>(); //사람 별로 받은 수를 기록하기 위한 해시맵

        for (String name : friends) {
            ArrayList<String> nowPersonGivedTo = new ArrayList<>();
            int nowPersonGivePresent = 0;
            int nowPersonGetPresent = 0;
            for (String gift : gifts) {
                String[] nowFrineds = gift.split(" ");
                if (nowFrineds[0].equals(name)) {
                    nowPersonGivedTo.add(nowFrineds[1]);
                    nowPersonGivePresent++;
                } else if (nowFrineds[1].equals(name)) {
                    nowPersonGetPresent++;
                }
            }
            interactions.put(name, nowPersonGivedTo);
            givePresent.put(name, nowPersonGivePresent);
            getPresent.put(name, nowPersonGetPresent);
        }

        System.out.println("주고받은 기록 : " + interactions.toString());
        System.out.println("사람 별 선물 준 수량 : " + givePresent.toString());
        System.out.println("사람 별 선물 받은 수량 : " + getPresent.toString());

        HashMap<String, HashMap<String, Integer>> interactionCountPerPerson = new HashMap<>(); //준놈, <받은놈, 수량>... 형태의 해시맵

        for (String givedName : friends) {
            HashMap<String, Integer> countPerPerson = new HashMap<>();
            for (String gotName : friends) {
                if (givedName.equals(gotName)) continue;
                int gotCount = 0;
                for (String person : interactions.get(givedName)) {
                    if (person.equals(gotName)) gotCount++;
                }
                countPerPerson.put(gotName, gotCount);
            }
            interactionCountPerPerson.put(givedName, countPerPerson);
        }

        //System.out.println("Map 사용후 주고받은 기록 변동 없는지 체크 : " + interactions.toString());
        System.out.println("주고받은 기록을 통해 센 사람별 준 수 : " + interactionCountPerPerson.toString());

        HashMap<String, Integer> willGetThisMonth = new HashMap<>();

        for (String givedName : friends) {
            int thisPersonWillGet = 0;
            int thisPersonPresentNum = givePresent.get(givedName) - getPresent.get(givedName);
            System.out.println("주체(" + givedName + ")의 선물지수 : " + thisPersonPresentNum);
            for (String gotName : friends) {
                if (givedName.equals(gotName)) continue;
                //주고받았는지를 먼저 검사
                int gived = interactionCountPerPerson.get(givedName).get(gotName); //지금 놈이 비교대상한테 준 수
                int got = interactionCountPerPerson.get(gotName).get(givedName); //비교대상이 지금 놈한테 준 수
                int comparePersonPresentNum = givePresent.get(gotName) - getPresent.get(gotName); //비교 대상의 선물지수
                System.out.println(gotName + "의 선물지수 : " + comparePersonPresentNum);
                if (gived != 0 || got != 0) { //주고받은 기록이 하나라도 있으면,
                    if (gived > got) thisPersonWillGet++; // 준 수가 더 크면 1개 받는다
                    else if (gived == got) { //같으면 선물지수를 비교한다.
                        if (thisPersonPresentNum > comparePersonPresentNum) thisPersonWillGet++;
                    }
                } else { //없으면, 선물지수를 비교한다
                    if (thisPersonPresentNum > comparePersonPresentNum) thisPersonWillGet++;
                }
            }
            willGetThisMonth.put(givedName, thisPersonWillGet);
        }

        System.out.println("이번 달 받을 수량 : " + willGetThisMonth.toString());

        int maxGet = 0;

        for (int willGet : willGetThisMonth.values()) {
            if (maxGet < willGet) maxGet = willGet;
        }

        System.out.println(maxGet);

        return maxGet;
    }
}