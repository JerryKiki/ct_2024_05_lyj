package com.ki.level0.p120869;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] spell, String[] dic) {
                String containsAllSpell = "";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<Character>();

        for(int i = 0; i < dic.length; i++) {
            if (dic[i].length() > spell.length) continue;
            int containsSpell = 0;
            for (int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j])) containsSpell++;
            }
            if (containsSpell == spell.length) {
                containsAllSpell = dic[i];
                break;
            }
        }

        if (containsAllSpell.isEmpty()) return 2;
        else {
            for (char c : containsAllSpell.toCharArray()) {
                if (set.add(c)) sb.append(c);
            }
        }

        String compare = sb.toString();
        if (containsAllSpell.equals(compare)) return 1;
        else return 2;
    }
}