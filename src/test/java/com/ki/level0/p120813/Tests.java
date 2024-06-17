package com.ki.level0.p120813;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("10 => {1, 3, 5, 7, 9")
    void t1() {
        int[] arr = new int[] {1, 3, 5, 7, 9};
        assertThat(new Solution().solution(10)).isEqualTo(arr);
    }

    @Test
    @DisplayName("15 => {1, 3, 5, 7, 9, 11, 13, 15}")
    void t2() {
        int[] arr = new int[] {1, 3, 5, 7, 9, 11, 13, 15};
        assertThat(new Solution().solution(15)).isEqualTo(arr);
    }

    @Test
    @DisplayName("19 => {1, 3, 5, 7, 9, 11, 13, 15, 17, 19")
    void t3() {
        int[] arr = new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        assertThat(new Solution().solution(19)).isEqualTo(arr);
    }
}
