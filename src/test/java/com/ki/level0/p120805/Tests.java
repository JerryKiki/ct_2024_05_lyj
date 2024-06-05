package com.ki.level0.p120805;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName(".")
    void ts1() {
        assertThat(new Solution().solution(10, 5)).isEqualTo(2);
    }

    @Test
    @DisplayName(".")
    void ts2() {
        assertThat(new Solution().solution(7, 2)).isEqualTo(3);
    }
}
