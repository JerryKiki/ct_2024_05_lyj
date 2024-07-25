package com.ki.level1.p68935;

//3진법 뒤집기
//n을 삼진법 변환 => 거꾸로 => 다시 10진수로 변환
//삼진법 변환 => 계속 3으로 나눠서 나머지 거꾸로 (여기서는 그대로 쓰면 되겠다)
//10진수로 재변환 => (뒤에서부터 0의자리) 3의 자릿수제곱 * 쓰여진 숫자해서 싹 더하기

import java.util.ArrayList;

class Solution {
    public int solution(int n) {

        //계산은 잘되는데 메모리초과가 뜬다;
        ArrayList<Integer> remains = new ArrayList<>();

        while(n != 1 && n != 2) {
            remains.add(n%3);
            n /= 3;
        }
        remains.add(n);

        //10진수로
        int sum = 0;
        for(int i = 0; i < remains.size(); i++) {
            sum += remains.get(i) * (int) Math.pow(3, remains.size() - i - 1);
        }

        return sum;
    }
}
