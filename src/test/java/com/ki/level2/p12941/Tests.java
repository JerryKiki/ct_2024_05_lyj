package com.ki.level2.p12941;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("29")
    void t1() {
        int[] arr1 = {1, 4, 2};
        int[] arr2 = {5, 4, 4};
        assertThat(new Solution().solution(arr1, arr2)).isEqualTo(29);
    }

    @Test
    @DisplayName("10")
    void t2() {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        assertThat(new Solution().solution(arr1, arr2)).isEqualTo(10);
    }

    @Test
    @DisplayName("110")
    void t3() {
        int[] arr1 = {1, 2, 100};
        int[] arr2 = {3, 4, 1};
        assertThat(new Solution().solution(arr1, arr2)).isEqualTo(110);
    }
}
