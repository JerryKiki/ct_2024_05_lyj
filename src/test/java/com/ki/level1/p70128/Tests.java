package com.ki.level1.p70128;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{1, 2, 3, 4}, {-3, -1, 0, 2} => 3")
    void t1() {
        int[] arr1 = new int[] {1, 2, 3, 4};
        int[] arr2 = new int[] {-3, -1, 0, 2};
        assertThat(new Solution().solution(arr1, arr2)).isEqualTo(3);
    }

    @Test
    @DisplayName("{-1, 0, 1}, {1, 0, -1} => -2")
    void t2() {
        int[] arr1 = new int[] {-1, 0, 1};
        int[] arr2 = new int[] {1, 0, -1};
        assertThat(new Solution().solution(arr1, arr2)).isEqualTo(-2);
    }
}
