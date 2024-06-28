package com.ki.level1.p133499;

//"aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음의 수를 리턴
class Solution {
    public int solution(String[] babbling) {
        String[] canPronounce = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        //babbling의 요소를 가져와서 canPronouce와 같은 요소들을 다 지우고,
        //String이 isEmpty()면 발음 가능한 개수를 +1

        //yeayaye같은 경우 break되면 안되는데 yeye만 남았을때 break가 됨...

        for (String babble : babbling) {

            //String pronounInARow = pronoun + pronoun;
            //if (babble.contains(pronounInARow)) break; //이걸 통과해야

            for (String pronoun : canPronounce) { //반복문으로 들어가게.
                babble = babble.replace(pronoun, "");
                if (babble.isEmpty()) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
