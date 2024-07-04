package com.ki.level0.p120868;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{1, 2} => 1")
    void t1() {
        int[] arr = {1, 2};
        assertThat(new Solution().solution(arr)).isEqualTo(1);
    }

    @Test
    @DisplayName("{3, 6} => 5")
    void t2() {
        int[] arr = {3, 6};
        assertThat(new Solution().solution(arr)).isEqualTo(5);
    }

    @Test
    @DisplayName("{11, 7} => 13")
    void t3() {
        int[] arr = {11, 7};
        assertThat(new Solution().solution(arr)).isEqualTo(5);
    }
}
