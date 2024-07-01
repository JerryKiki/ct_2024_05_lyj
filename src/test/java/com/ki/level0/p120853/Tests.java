package com.ki.level0.p120853;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1 2 Z 3 => 4")
    void t1() {
        assertThat(new Solution().solution("1 2 Z 3")).isEqualTo(4);
    }

    @Test
    @DisplayName("10 20 30 40 => 100")
    void t2() {
        assertThat(new Solution().solution("10 20 30 40")).isEqualTo(100);
    }

    @Test
    @DisplayName("10 Z 20 Z 1 => 1")
    void t3() {
        assertThat(new Solution().solution("10 Z 20 Z 1")).isEqualTo(1);
    }

    @Test
    @DisplayName("10 Z 20 Z => 1")
    void t4() {
        assertThat(new Solution().solution("10 Z 20 Z")).isEqualTo(0);
    }

    @Test
    @DisplayName("-1 -2 -3 Z => -3")
    void t5() {
        assertThat(new Solution().solution("-1 -2 -3 Z")).isEqualTo(-3);
    }
}
