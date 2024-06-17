package com.ki.level0.p120808;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName(".")
    void t1() {
        int[] arr = new int[] {5, 4};
        assertThat(new Solution().solution(1, 2, 3, 4)).isEqualTo(arr);
    }
}
