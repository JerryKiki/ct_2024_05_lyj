package com.ki.level1.p12932;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("12345 => 5, 4, 3, 2, 1")
    void t1() {
        int[] array = new int[] {5, 4, 3, 2, 1};
        assertThat(new Solution().solution(12345)).isEqualTo(array);
    }

    @Test
    @DisplayName("1239401 => 1, 0, 4, 9, 3, 2, 1")
    void t2() {
        int[] array = new int[] {1, 0, 4, 9, 3, 2, 1};
        assertThat(new Solution().solution(1239401)).isEqualTo(array);
    }

}
