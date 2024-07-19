package com.ki.level1.p82612;


//놀이기구의 이용료 price
//처음 가지고 있던 금액 money
//놀이기구의 이용 횟수 count
//놀이기구를 N 번 째 이용한다면 price의 N배를 받음
//놀이기구를 count번 타면 가진 금액에서 얼마 모자라는지 return
//모자라지 않다면 0을 return
class Solution {
    public long solution(int price, int money, int count) {
        //총 금액
        long totalPrice = 0;
        for (int i = 1; i <= count; i++) {
            totalPrice += (long) price * i;
        }

        if (money >= totalPrice) return 0;

        return totalPrice - money;
    }
}
