package com.ki.level1.p142086;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("banana => [-1, -1, -1, 2, 2, 2]")
    void t1() {
        int[] arr = {-1, -1, -1, 2, 2, 2};
        assertThat(new Solution().solution("banana")).isEqualTo(arr);
    }

    @Test
    @DisplayName("foobar => [-1, -1, 1, -1, -1, -1]")
    void t2() {
        int[] arr = {-1, -1, 1, -1, -1, -1};
        assertThat(new Solution().solution("foobar")).isEqualTo(arr);
    }

    @Test
    @DisplayName("rickyjecky => [-1, -1, -1, -1, -1, -1, -1, 5, 5, 5]")
    void t3() {
        int[] arr = {-1, -1, -1, -1, -1, -1, -1, 5, 5, 5};
        assertThat(new Solution().solution("rickyjecky")).isEqualTo(arr);
    }
}
