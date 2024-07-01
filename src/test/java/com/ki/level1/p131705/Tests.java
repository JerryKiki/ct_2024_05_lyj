package com.ki.level1.p131705;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("-2, 3, 0, 2, -5 => 2")
    void t1() {
        int[] numbers = {-2, 3, 0, 2, -5};
        assertThat(new Solution().solution(numbers)).isEqualTo(2);
    }

    @Test
    @DisplayName("-3, -2, -1, 0, 1, 2, 3 => 5")
    void t2() {
        int[] numbers = {-3, -2, -1, 0, 1, 2, 3};
        assertThat(new Solution().solution(numbers)).isEqualTo(5);
    }

    @Test
    @DisplayName("-1, 1, -1, 1 => 0")
    void t3() {
        int[] numbers = {-1, 1, -1, 1};
        assertThat(new Solution().solution(numbers)).isEqualTo(0);
    }

}
