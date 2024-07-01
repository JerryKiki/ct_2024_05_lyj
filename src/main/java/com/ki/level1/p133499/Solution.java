package com.ki.level1.p133499;

//"aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음의 수를 리턴
class Solution {
    public int solution(String[] babbling) {
        String[] canPronounce = {"aya", "ye", "woo", "ma"};
        String[] pronounceInARow = {"ayaaya", "yeye", "woowoo", "mama"};
        String babbleCheck1 = "";
        String babbleCheck2 = "";
        int answer = 0;

        //babbling의 요소를 가져와서 canPronouce와 같은 요소들을 다 지우고,
        //String이 isEmpty()면 발음 가능한 개수를 +1
        for (String babble : babbling) {
            String[] pronounInARow = {"ayaaya", "yeye", "woowoo", "mama"}; //이걸 다 포함 안해야 반복문 안으로 들어옴
            if (!babble.contains(pronounInARow[0]) && !babble.contains(pronounInARow[1]) && !babble.contains(pronounInARow[2]) && !babble.contains(pronounInARow[3])) { //이걸 통과해야
                babbleCheck1 = babble;
                babbleCheck2 = babble;
                for (String pronoun : canPronounce) { //앞에서 한 번 체크
                    babbleCheck1 = babbleCheck1.replace(pronoun, "");
                }
                for (int i = 3; i >= 0; i--) { //뒤에서 한번 체크
                    babbleCheck2 = babbleCheck2.replace(canPronounce[i], "");
                }
                if (babbleCheck1.isEmpty() && babbleCheck2.isEmpty()) { //모두 통과하면,
                    answer++;
                }
            }
        }
        return answer;
    }
}