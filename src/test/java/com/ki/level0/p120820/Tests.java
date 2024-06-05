package com.ki.level0.p120820;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("t1")
    void t1() {
        assertThat(new Solution().solution(40)).isEqualTo(1983);
    }

    @Test
    @DisplayName("t2")
    void t2() {
        assertThat(new Solution().solution(23)).isEqualTo(2000);
    }

    @Test
    @DisplayName("t3")
    void t3() {
        assertThat(new Solution().solution(56)).isEqualTo(2022 - 56 + 1);
    }
}
