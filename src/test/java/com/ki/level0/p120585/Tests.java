package com.ki.level0.p120585;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{149, 180, 192, 170}, 167 => 3")
    void t1() {
        int[] arr = new int[]{149, 180, 192, 170};
        assertThat(new Solution().solution(arr, 167)).isEqualTo(3);
    }
    @Test
    @DisplayName("{180, 120, 140}, 190 => 0")
    void t2() {
        int[] arr = new int[]{180, 120, 140};
        assertThat(new Solution().solution(arr, 190)).isEqualTo(0);
    }
    @Test
    @DisplayName("{190, 150, 140, 176, 182}, 178 => 2")
    void t3() {
        int[] arr = new int[]{190, 150, 140, 176, 182};
        assertThat(new Solution().solution(arr, 178)).isEqualTo(2);
    }
}
