package com.ki.level1.p42748;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1")
    void t1() {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] cmd = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] rs = {5, 6, 3};
        assertThat(new Solution().solution(arr, cmd)).isEqualTo(rs);
    }
}
