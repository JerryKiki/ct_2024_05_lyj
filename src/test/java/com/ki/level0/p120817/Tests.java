package com.ki.level0.p120817;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("t1")
    void t1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(new Solution().solution(arr)).isEqualTo(5.5);
    }

    @Test
    @DisplayName("t2")
    void t2() {
        int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        assertThat(new Solution().solution(arr)).isEqualTo(94.0);
    }

    @Test
    @DisplayName("t3")
    void t3() {
        int[] arr = {107, 108, 109, 110, 111, 112};
        double answer;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        answer = (double) sum / arr.length;
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }
}
