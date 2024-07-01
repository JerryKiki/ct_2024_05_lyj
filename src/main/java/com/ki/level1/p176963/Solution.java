package com.ki.level1.p176963;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> yearningByName = new HashMap<>();

        for(int i = 0; i < name.length; i++) {
            yearningByName.put(name[i], yearning[i]);
        }
        for(int i = 0; i < photo.length; i++) {
            int answerElement = 0;
            for(int j = 0; j < photo[i].length; j++) {
                for(String thisName : yearningByName.keySet()) {
                    //String debugCheck = photo[i][j];
                    if (thisName.equals(photo[i][j])) {
                        answerElement += yearningByName.get(thisName);
                    }
                }
            }
            answer[i] = answerElement;
        }
        return answer;
    }
}
