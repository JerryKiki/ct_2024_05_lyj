package com.ki.level1.p12935;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("4, 3, 2, 1 => 4, 3, 2")
    void t1() {
        int[] arr = new int[] {4, 3, 2, 1};
        int[] arr2 = new int[] {4, 3, 2};
        assertThat(new Solution().solution(arr)).isEqualTo(arr2);
    }

    @Test
    @DisplayName("10 => -1")
    void t2() {
        int[] arr = new int[] {10};
        int[] arr2 = new int[] {-1};
        assertThat(new Solution().solution(arr)).isEqualTo(arr2);
    }

    @Test
    @DisplayName("10, 11, 13, 1, 3 => 10, 11, 13, 3")
    void t3() {
        int[] arr = new int[] {10, 11, 13, 1, 3};
        int[] arr2 = new int[] {10, 11, 13, 3};
        assertThat(new Solution().solution(arr)).isEqualTo(arr2);
    }

    @Test
    @DisplayName("200, 300, 500, 600 => 300, 500, 600")
    void t4() {
        int[] arr = new int[] {200, 300, 500, 600};
        int[] arr2 = new int[] {300, 500, 600};
        assertThat(new Solution().solution(arr)).isEqualTo(arr2);
    }
}
