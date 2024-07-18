package com.ki.level0.p120809;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1, 2, 3, 4, 5 => 2, 4, 6, 8, 10")
    void t1() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        assertThat(new Solution().solution(arr1)).isEqualTo(arr2);
    }

    @Test
    @DisplayName("1, 2, 100, -99, 1, 2, 3 => 2, 4, 200, -198, 2, 4, 6")
    void t2() {
        int[] arr1 = {1, 2, 100, -99, 1, 2, 3};
        int[] arr2 = {2, 4, 200, -198, 2, 4, 6};
        assertThat(new Solution().solution(arr1)).isEqualTo(arr2);
    }
}
