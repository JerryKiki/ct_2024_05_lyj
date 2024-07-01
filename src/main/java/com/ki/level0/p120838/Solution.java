package com.ki.level0.p120838;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        String[] letters = letter.split(" ");
        HashMap<String, String> morseMap = setMorseMap();

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : letters) {
            stringBuilder.append(morseMap.get(s));
        }

        return stringBuilder.toString();
    }

    public HashMap<String, String> setMorseMap() {
        HashMap<String, String> morseMap = new HashMap<>();

        morseMap.put(".-", "a");
        morseMap.put("-...", "b");
        morseMap.put("-.-.", "c");
        morseMap.put("-..", "d");
        morseMap.put(".", "e");
        morseMap.put("..-.", "f");
        morseMap.put("--.", "g");
        morseMap.put("....", "h");
        morseMap.put("..", "i");
        morseMap.put(".---", "j");
        morseMap.put("-.-", "k");
        morseMap.put(".-..", "l");
        morseMap.put("--", "m");
        morseMap.put("-.", "n");
        morseMap.put("---", "o");
        morseMap.put(".--.", "p");
        morseMap.put("--.-", "q");
        morseMap.put(".-.", "r");
        morseMap.put("...", "s");
        morseMap.put("-", "t");
        morseMap.put("..-", "u");
        morseMap.put("...-", "v");
        morseMap.put(".--", "w");
        morseMap.put("-..-", "x");
        morseMap.put("-.--", "y");
        morseMap.put("--..", "z");

        return morseMap;
    }
}
