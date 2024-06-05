package com.ki.level0.p120824;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{1, 2, 3, 4, 5} => {2, 3}")
    void t1() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] answer = new int[]{2, 3};
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }

    @Test
    @DisplayName("{1, 3, 5, 7} => {0, 4}")
    void t2() {
        int[] arr = new int[]{1, 3, 5, 7};
        int[] answer = new int[]{0, 4};
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }

    @Test
    @DisplayName("{2, 4, 6, 8} => {4, 0}")
    void t3() {
        int[] arr = new int[]{2, 4, 6, 8};
        int[] answer = new int[]{4, 0};
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }
}
