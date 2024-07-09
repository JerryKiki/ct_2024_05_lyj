package com.ki.level1.p12906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1,1,3,3,0,1,1] -> [1,3,0,1]")
    void t1() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = {1, 3, 0, 1};
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }

    @Test
    @DisplayName("[4,4,4,3,3] -> [4,3]")
    void t2() {
        int[] arr = {4, 4, 4, 3, 3};
        int[] answer = {4, 3};
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5] -> [1, 2, 3, 4, 5]")
    void t3() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] answer = {1, 2, 3, 4, 5};
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }

    @Test
    @DisplayName("[1, 2, 2, 4, 4, 5] -> [1, 2, 4, 5]")
    void t4() {
        int[] arr = {1, 2, 2, 4, 4, 5};
        int[] answer = {1, 2, 4, 5};
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }
}
