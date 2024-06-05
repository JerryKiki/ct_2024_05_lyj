package com.ki.level0.p120821;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("t1")
    void t1() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        assertThat(new Solution().solution(arr1)).isEqualTo(arr2);
    }
    @Test
    @DisplayName("t2")
    void t2() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        assertThat(new Solution().solution(arr1)).isEqualTo(arr2);
    }
}
