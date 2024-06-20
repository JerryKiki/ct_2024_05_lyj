package com.ki.level1.p86051;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1,2,3,4,6,7,8,0 => 14")
    void t1() {
        int[] arr = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        assertThat(new Solution().solution(arr)).isEqualTo(14);
    }

    @Test
    @DisplayName("5,8,4,0,6,7,9 => 6")
    void t2() {
        int[] arr = new int[]{5, 8, 4, 0, 6, 7, 9};
        assertThat(new Solution().solution(arr)).isEqualTo(6);
    }
}
