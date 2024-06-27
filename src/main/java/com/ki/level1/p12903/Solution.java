package com.ki.level1.p12903;

//단어 s의 가운데 글자를 반환하는 함수
//단어의 길이가 짝수라면 가운데 두글자를 반환
class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0) { //짝수개라면
            //abcd면 1, 2번
            //abcdef 면 2, 3번
            //나눈 몫, 나눈 몫 - 1
            char c1 = s.charAt(s.length()/2 - 1);
            char c2 = s.charAt(s.length()/2);
            answer = Character.toString(c1) + Character.toString(c2);

        } else { //홀수개라면
            char c1 = s.charAt(s.length()/2);
            answer = Character.toString(c1);
        }
        return answer;
    }
}