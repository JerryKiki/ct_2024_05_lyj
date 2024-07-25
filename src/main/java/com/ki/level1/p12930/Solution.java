package com.ki.level1.p12930;

//문장을 변형 : 단어 기준으로 짝수(0포함)은 대문자 홀수는 소문자
class Solution {
    public String solution(String s) {
        s = s.toLowerCase();

        char[] ss = s.toCharArray();
        boolean nextIsWord = !(ss[0] == ' ');
        int wordIdx = 2;
        for (int i = 0; i < ss.length; i++) {
            try {
                if (nextIsWord) {
                    if (wordIdx % 2 == 0) {
                        ss[i] = Character.toUpperCase(ss[i]);
                    }
                    wordIdx++;
                    if (ss[i + 1] == ' ') {
                        nextIsWord = false;
                        wordIdx = 2;
                    }
                }
                if ((ss[i] == ' ') && !(ss[i + 1] == ' ')) {
                    nextIsWord = true;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }

        return new String(ss);
    }
}