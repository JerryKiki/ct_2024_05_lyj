package com.ki.level1.p250137;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("30 => 5")
    void t1() {
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        assertThat(new Solution().solution(bandage, health, attacks)).isEqualTo(5);
    }

    @Test
    @DisplayName("20 => -1")
    void t2() {
        int[] bandage = {3, 2, 7};
        int health = 20;
        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};
        assertThat(new Solution().solution(bandage, health, attacks)).isEqualTo(-1);
    }

    @Test
    @DisplayName("20 => -1 (2)")
    void t3() {
        int[] bandage = {4, 2, 7};
        int health = 20;
        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};
        assertThat(new Solution().solution(bandage, health, attacks)).isEqualTo(-1);
    }

    @Test
    @DisplayName("20 => -1 (2)")
    void t4() {
        int[] bandage = {1, 1, 1};
        int health = 5;
        int[][] attacks = {{1, 2}, {3, 2}};
        assertThat(new Solution().solution(bandage, health, attacks)).isEqualTo(3);
    }
}
