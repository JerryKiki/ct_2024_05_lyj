package com.ki.level2.p70129;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("110010101001 => {3, 8}")
    void t1() {
        int[] arr = {3, 8};
        assertThat(new Solution().solution("110010101001")).isEqualTo(arr);
    }

    @Test
    @DisplayName("01110 => {3, 3}")
    void t2() {
        int[] arr = {3, 3};
        assertThat(new Solution().solution("01110")).isEqualTo(arr);
    }

    @Test
    @DisplayName("1111111 => {4, 1}")
    void t3() {
        int[] arr = {4, 1};
        assertThat(new Solution().solution("1111111")).isEqualTo(arr);
    }


}
