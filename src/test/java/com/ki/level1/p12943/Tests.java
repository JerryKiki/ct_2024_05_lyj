package com.ki.level1.p12943;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("6 => 8")
    void t1() {
        assertThat(Solution.solution(6)).isEqualTo(8);
    }

    @Test
    @DisplayName("16 => 4")
    void t2() {
        assertThat(Solution.solution(16)).isEqualTo(4);
    }

    @Test
    @DisplayName("626331 => -1")
    void t3() {
        assertThat(Solution.solution(626331)).isEqualTo(-1);
    }
}
