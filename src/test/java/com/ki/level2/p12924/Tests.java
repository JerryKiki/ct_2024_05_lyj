package com.ki.level2.p12924;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("15 => 4")
    void t1() {
        assertThat(new Solution().solution(15)).isEqualTo(4);
    }

    @Test
    @DisplayName("16 => 1")
    void t2() {
        assertThat(new Solution().solution(16)).isEqualTo(1);
    }

    @Test
    @DisplayName("25 => 3")
    void t3() {
        assertThat(new Solution().solution(25)).isEqualTo(3);
    }
}
