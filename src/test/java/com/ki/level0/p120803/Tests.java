package com.ki.level0.p120803;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName(".")
    void t1 () {
        assertThat(new Solution().solution(2, 3)).isEqualTo(-1);
    }

    @Test
    @DisplayName(".")
    void t2 () {
        assertThat(new Solution().solution(100, 2)).isEqualTo(98);
    }

    @Test
    @DisplayName(".")
    void t3 () {
        assertThat(new Solution().solution(300, 200)).isEqualTo(100);
    }
}
