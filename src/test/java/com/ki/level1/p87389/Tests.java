package com.ki.level1.p87389;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10 => 3")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(3);
    }

    @Test
    @DisplayName("12 => 11")
    void t2() {
        assertThat(new Solution().solution(12)).isEqualTo(11);
    }

    @Test
    @DisplayName("50 => 7")
    void t3() {
        assertThat(new Solution().solution(50)).isEqualTo(7);
    }
}
