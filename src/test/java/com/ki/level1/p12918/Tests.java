package com.ki.level1.p12918;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("a234 => false")
    void t1() {
        assertThat(new Solution().solution("a234")).isEqualTo(false);
    }

    @Test
    @DisplayName("1234 => true")
    void t2() {
        assertThat(new Solution().solution("1234")).isEqualTo(true);
    }

    @Test
    @DisplayName("12345 => false")
    void t3() {
        assertThat(new Solution().solution("12345")).isEqualTo(false);
    }

    @Test
    @DisplayName("12345a => false")
    void t4() {
        assertThat(new Solution().solution("12345a")).isEqualTo(false);
    }

    @Test
    @DisplayName("123456 => true")
    void t5() {
        assertThat(new Solution().solution("123456")).isEqualTo(true);
    }
}
