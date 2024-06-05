package com.ki.level0.p120804;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName(".")
    void ts1 () {
        assertThat(new Solution().solution(3, 4)).isEqualTo(12);
    }

    @Test
    @DisplayName(".")
    void ts2 () {
        assertThat(new Solution().solution(27, 19)).isEqualTo(513);
    }
}
