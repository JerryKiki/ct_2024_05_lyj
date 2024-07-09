package com.ki.level1.p159994;

//원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
//한 번 사용한 카드는 다시 사용할 수 없습니다.
//카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
//기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.

//문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때,
//cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를,
// 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int cards1Idx = 0;
        int cards2Idx = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String goalJoin = String.join("", goal);

        for (int i = 0; i < goal.length; i++) {
            if (cards1Idx < cards1.length && cards1[cards1Idx].equals(goal[i])) {
                stringBuilder.append(cards1[cards1Idx]);
                cards1Idx++;
            }
            else if (cards2Idx < cards2.length && cards2[cards2Idx].equals(goal[i])) {
                stringBuilder.append(cards2[cards2Idx]);
                cards2Idx++;
            }
            else break;

            String nowString = stringBuilder.toString();

            if (nowString.equals(goalJoin)) return "Yes";
        }

        if (cards1Idx == (cards1.length) && cards2Idx == (cards2.length)) return "Yes";
        else return "No";
    }
}