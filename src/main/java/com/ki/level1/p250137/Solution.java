package com.ki.level1.p250137;

//붕대감기
//bandage = 시전시간(해당 초수 동안 붕대를 감음), 초당 회복량, 추가 회복량
//health = 최대 체력
//attacks = 공격시간(해당 초에 한번 공격), 피해량
//몬스터의 마지막 공격까지 살아남는지 체크, 살아남으면 남은 체력, 죽었으면 -1 리턴
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int lastSec = attacks[attacks.length - 1][0]; //몬스터가 마지막 공격하는 초
        int attacksIdx = 0;
        int nowHealth = health;
        int bandageTime = bandage[0];
        int bandaging = 0;
        int bandageRecoveryPerSec = bandage[1];
        int bandageRecoveryAfter = bandage[2];

        for (int i = 0; i <= lastSec; i++) { //해당 초까지 반복
            if (nowHealth >= health) {
                nowHealth = health;
            }
            if (attacks[attacksIdx][0] == i) { //몬스터가 공격하는 초를 감지
                nowHealth = nowHealth - attacks[attacksIdx][1]; //몬스터 공격력에 따라 health 차감
                bandaging = 0; //시전시간 0
                attacksIdx++; //몬스터의 다음 공격을 감지할 수 있도록 세팅
            } else { //몬스터가 공격하지 않으면
                if (nowHealth < health) {
                    nowHealth += bandageRecoveryPerSec; //초당 회복량 +
                }
                bandaging++; // 시전시간 +1
                if (bandaging == bandageTime) { //시전시간이 max 시전시간이면
                    nowHealth += bandageRecoveryAfter; //보너스만큼 회복
                    bandaging = 0; //시전시간 0으로
                }
            }
            if (nowHealth <= 0) {
                return -1;
            }
        }
        return nowHealth;
    }
}
