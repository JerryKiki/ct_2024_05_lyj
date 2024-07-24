package com.ki.level1.p147355;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("3141592, 271 => 2")
    void t1() {
        assertThat(new Solution().solution("3141592", "271")).isEqualTo(2);
    }

    @Test
    @DisplayName("500220839878, 7 => 8")
    void t2() {
        assertThat(new Solution().solution("500220839878", "7")).isEqualTo(8);
    }

    @Test
    @DisplayName("10203, 15 => 3")
    void t3() {
        assertThat(new Solution().solution("10203", "15")).isEqualTo(3);
    }
}
