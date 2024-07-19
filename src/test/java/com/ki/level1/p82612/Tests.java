package com.ki.level1.p82612;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("3, 20, 4 => 10")
    void t1() {
        assertThat(new Solution().solution(3, 20, 4)).isEqualTo(10);
    }

    @Test
    @DisplayName("5, 30, 7 => 110")
    void t2() {
        assertThat(new Solution().solution(5, 30, 7)).isEqualTo(110);
    }

    @Test
    @DisplayName("1, 30, 3 => 0")
    void t3() {
        assertThat(new Solution().solution(1, 30, 3)).isEqualTo(0);
    }

    @Test
    @DisplayName("1, 6, 3 => 0")
    void t4() {
        assertThat(new Solution().solution(1, 6, 3)).isEqualTo(0);
    }
}
