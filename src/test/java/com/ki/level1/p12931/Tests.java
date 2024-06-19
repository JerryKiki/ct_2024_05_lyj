package com.ki.level1.p12931;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("123 => 6")
    void t1() {
        assertThat(new Solution().solution(123)).isEqualTo(6);
    }

    @Test
    @DisplayName("987 => 24")
    void t2() {
        assertThat(new Solution().solution(987)).isEqualTo(24);
    }

    @Test
    @DisplayName("99,999,999 => 72")
    void t3() {
        assertThat(new Solution().solution(99999999)).isEqualTo(72);
    }

    @Test
    @DisplayName("0 => 0")
    void t4() {
        assertThat(new Solution().solution(0)).isEqualTo(0);
    }
}
