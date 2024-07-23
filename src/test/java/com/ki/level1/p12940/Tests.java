package com.ki.level1.p12940;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("3, 12 => {3, 12}")
    void t1() {
        int[] rs = { 3, 12 };
        assertThat(new Solution().solution(3, 12)).isEqualTo(rs);
    }

    @Test
    @DisplayName("2, 5 => {1, 10}")
    void t2() {
        int[] rs = { 1, 10 };
        assertThat(new Solution().solution(2, 5)).isEqualTo(rs);
    }

    @Test
    @DisplayName("10, 100 => {10, 100}")
    void t3() {
        int[] rs = { 10, 100 };
        assertThat(new Solution().solution(10, 100)).isEqualTo(rs);
    }

    @Test
    @DisplayName("49, 14 => {7, 98}")
    void t4() {
        int[] rs = { 7, 98 };
        assertThat(new Solution().solution(49, 14)).isEqualTo(rs);
    }
}
