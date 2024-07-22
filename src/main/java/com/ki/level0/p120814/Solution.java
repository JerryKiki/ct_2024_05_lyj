package com.ki.level0.p120814;

//피자를 나눠먹을 사람의 수 n이 주어질 때,
//모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return
class Solution {
    public int solution(int n) {
        if (n % 7 != 0) {
            return n / 7 + 1;
        }

        return n / 7;
    }
}