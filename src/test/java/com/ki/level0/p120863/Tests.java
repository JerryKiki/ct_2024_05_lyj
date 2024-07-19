package com.ki.level0.p120863;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("3x + 7 + x => 4x + 7")
    void t1() {
        assertThat(new Solution().solution("3x + 7 + x")).isEqualTo("4x + 7");
    }

    @Test
    @DisplayName("x + x + x => 3x")
    void t2() {
        assertThat(new Solution().solution("x + x + x")).isEqualTo("3x");
    }

    @Test
    @DisplayName("x + 5 => x + 5")
    void t3() {
        assertThat(new Solution().solution("x + 5")).isEqualTo("x + 5");
    }

    @Test
    @DisplayName("x + x => 2x")
    void t4() {
        assertThat(new Solution().solution("x + x")).isEqualTo("2x");
    }

    @Test
    @DisplayName("7 + 5 => 12")
    void t5() {
        assertThat(new Solution().solution("7 + 5")).isEqualTo("12");
    }

    @Test
    @DisplayName("1 + 3 + 4 => 8")
    void t6() {
        assertThat(new Solution().solution("1 + 3 + 4")).isEqualTo("8");
    }

    @Test
    @DisplayName("11x + 22x + 33x")
    void t7() {
        assertThat(new Solution().solution("11x + 22x + 33x")).isEqualTo("66x");
    }

    @Test
    @DisplayName("x + 1")
    void t8() {
        assertThat(new Solution().solution("x + 1")).isEqualTo("x + 1");
    }

    @Test
    @DisplayName("0")
    void t9() {
        assertThat(new Solution().solution("0")).isEqualTo("0");
    }

    @Test
    @DisplayName("x")
    void t10() {
        assertThat(new Solution().solution("x")).isEqualTo("x");
    }

}
