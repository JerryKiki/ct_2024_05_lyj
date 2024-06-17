package com.ki.level0.p120811;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{1, 2, 7, 10, 11} => 7")
    void t1() {
        int[] arr = new int[]{1, 2, 7, 10, 11};
        assertThat(new Solution().solution(arr)).isEqualTo(7);
    }
    @Test
    @DisplayName("{9, -1, 0} => 0")
    void t2() {
        int[] arr = new int[]{9, -1, 0};
        assertThat(new Solution().solution(arr)).isEqualTo(0);
    }
    @Test
    @DisplayName("{3, 4, 5, 10, 1, 6, 7} => 5")
    void t3() {
        int[] arr = new int[]{3, 4, 5, 10, 1, 6, 7};
        assertThat(new Solution().solution(arr)).isEqualTo(5);
    }
}
