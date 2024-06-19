package com.ki.level1.p12954;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("2, 5 => {2, 4, 6, 8, 10")
    void t1() {
        long[] arr = new long[] {2, 4, 6, 8, 10};
        assertThat(new Solution().solution(2, 5)).isEqualTo(arr);
    }

    @Test
    @DisplayName("4, 3 => {4, 8, 12")
    void t2() {
        long[] arr = new long[] {4, 8, 12};
        assertThat(new Solution().solution(4, 3)).isEqualTo(arr);
    }
}
