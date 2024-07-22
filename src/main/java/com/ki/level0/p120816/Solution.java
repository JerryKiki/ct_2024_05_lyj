package com.ki.level0.p120816;

//피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
// 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
// n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return
class Solution {
    public int solution(int slice, int n) {
        // 나누어 떨어지면 그 만큼만
        if (n % slice == 0) return n / slice;
        // 나머지가 있으면 몫 + 1 (else 생략)
        return n / slice + 1;
    }
}
