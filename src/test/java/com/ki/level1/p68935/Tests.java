package com.ki.level1.p68935;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("45 => 1200 => 0021 => 7")
    void t1() {
        assertThat(new Solution().solution(45)).isEqualTo(7);
    }

    @Test
    @DisplayName("125 => 11122 => 22111 => 229")
    void t2() {
        assertThat(new Solution().solution(125)).isEqualTo(229);
    }

    @Test
    @DisplayName("5 => 12 => 21 => 7")
    void t3() {
        assertThat(new Solution().solution(5)).isEqualTo(7);
    }
}
