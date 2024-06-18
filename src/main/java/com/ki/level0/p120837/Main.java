package com.ki.level0.p120837;

public class Main {
}

class Solution {
    public int solution(int hp) {
        int power1 = 5;
        int power2 = 3;
        int power3 = 1;

        int generalAnt = hp/power1;
        int soldierAnt = hp%power1/power2;
        int workAnt = hp%power1%power2/power3;

        return generalAnt + soldierAnt + workAnt;
    }
}
