package com.ki.level0.p120868;

//선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
//나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int[] sides) {

        int longer = Math.max(sides[0], sides[1]);
        int shorter = Math.min(sides[0], sides[1]);

        int sameWithLongerSide = 1; //주어진 변과 같은 변 하나는 기본값

        //case 1 : 주어진 두 값이 작은 변들일 경우
        //longer + shorter보다 작고 loger보다 커야함
        int newSideIsMax = 0;
        for (int i = longer + 1; i < longer + shorter; i++) {
            newSideIsMax++;
        }

        //case 1 : longer가 가장 긴 변인 경우
        //shorter + new값보다 작아야함
        //longer - shorter보다 큰 값이되 longer보다 작은 값
        int longerSideIsMax = 0;
        //for ()

        return 0;
    }
}
