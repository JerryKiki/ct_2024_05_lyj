package com.ki.level1.p12928;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("12 -> 28")
    void t1() {
        assertThat(new Solution().solution(12)).isEqualTo(28);
    }

    @Test
    @DisplayName("5 -> 6")
    void t2() {
        assertThat(new Solution().solution(5)).isEqualTo(6);
    }

    @Test
    @DisplayName("100 -> 1+2+4+5+10+20+25+50+100")
    void t3() {
        assertThat(new Solution().solution(100)).isEqualTo(1+2+4+5+10+20+25+50+100);
    }

    @Test
    @DisplayName("0 -> 0")
    void t4() {
        assertThat(new Solution().solution(0)).isEqualTo(0);
    }
}
