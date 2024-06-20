package com.ki.level1.p76501;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("4, 7, 12, true, false, true => 9")
    void t1() {
        int[] arr1 = new int[] {4, 7, 12};
        boolean[] arr2 = new boolean[] {true, false, true};
        assertThat(new Solution().solution(arr1, arr2)).isEqualTo(9);
    }

    @Test
    @DisplayName("1, 2, 3, false, false, true => 9")
    void t2() {
        int[] arr1 = new int[] {1, 2, 3};
        boolean[] arr2 = new boolean[] {false, false, true};
        assertThat(new Solution().solution(arr1, arr2)).isEqualTo(0);
    }
}
