package com.ki.level1.p12912;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("3, 5 => 12")
    void t1() {
        assertThat(new Solution().solution(3, 5)).isEqualTo(12);
    }

    @Test
    @DisplayName("3, 3 => 3")
    void t2() {
        assertThat(new Solution().solution(3, 3)).isEqualTo(3);
    }

    @Test
    @DisplayName("5, 3 => 12")
    void t3() {
        assertThat(new Solution().solution(5, 3)).isEqualTo(12);
    }

    @Test
    @DisplayName("10, 6 => 40")
    void t4() {
        assertThat(new Solution().solution(10, 6)).isEqualTo(40);
    }


}
