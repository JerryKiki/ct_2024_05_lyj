package com.ki.level2.p12945;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("3 = > 2")
    void t1() {
        assertThat(new Solution().solution(3)).isEqualTo(2);
    }

    @Test
    @DisplayName("5 = > 5")
    void t2() {
        assertThat(new Solution().solution(5)).isEqualTo(5);
    }

    @Test
    @DisplayName("47 = > 2,971,215,073 (2)")
    void t3() {
        assertThat(new Solution().solution(47)).isEqualTo(2);
    }
}
