package com.ki.level0.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("t1")
    void t1() {
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("t2")
    void t2() {
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }

    @Test
    @DisplayName("t3")
    void t3() {
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("t4")
    void t4() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }
}


