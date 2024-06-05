package com.ki.level0.p120806;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("t1")
    void t1() {
        assertThat(new Solution().solution(3, 2)).isEqualTo(1500);
    }

    @Test
    @DisplayName("t2")
    void t2() {
        assertThat(new Solution().solution(7, 3)).isEqualTo(2333);
    }

    @Test
    @DisplayName("t3")
    void t3() {
        assertThat(new Solution().solution(1, 16)).isEqualTo(62);
    }

    @Test
    @DisplayName("t4")
    void t4() {
        assertThat(new Solution().solution(10, 4)).isEqualTo(2500);
    }
}
