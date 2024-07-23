package com.ki.level1.p12982;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{1, 3, 2, 5, 4}, 9 => 3")
    void t1() {
        int[] arr = {1, 3, 2, 5, 4};
        assertThat(new Solution().solution(arr, 9)).isEqualTo(3);
    }

    @Test
    @DisplayName("{2, 2, 3, 3}, 10 => 4")
    void t2() {
        int[] arr = {2, 2, 3, 3};
        assertThat(new Solution().solution(arr, 10)).isEqualTo(4);
    }

    @Test
    @DisplayName("{100, 500, 200, 400}, 1000 => 3")
    void t3() {
        int[] arr = {100, 500, 200, 400};
        assertThat(new Solution().solution(arr, 1000)).isEqualTo(3);
    }
}
