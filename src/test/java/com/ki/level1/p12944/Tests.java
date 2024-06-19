package com.ki.level1.p12944;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{1, 2, 3, 4} => 2.5")
    void t1() {
        int[] arr = new int[] {1, 2, 3, 4};
        assertThat(new Solution().solution(arr)).isEqualTo(2.5);
    }

    @Test
    @DisplayName("{5, 5} => 5")
    void t2() {
        int[] arr = new int[] {5, 5};
        assertThat(new Solution().solution(arr)).isEqualTo(5);
    }

    @Test
    @DisplayName("{1, 2, 3, 4, 5, 6, 7, 8, 9, 10} => 5.5")
    void t3() {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(new Solution().solution(arr)).isEqualTo(5.5);
    }
}
