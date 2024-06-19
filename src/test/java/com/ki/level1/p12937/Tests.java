package com.ki.level1.p12937;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("3 => Odd")
    void t1() {
        assertThat(new Solution().solution(3)).isEqualTo("Odd");
    }

    @Test
    @DisplayName("4 => Even")
    void t2() {
        assertThat(new Solution().solution(4)).isEqualTo("Even");
    }

    @Test
    @DisplayName("0 => Even")
    void t3() {
        assertThat(new Solution().solution(0)).isEqualTo("Even");
    }
}
