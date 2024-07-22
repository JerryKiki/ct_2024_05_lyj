package com.ki.level1.p12950;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[[1,2],[2,3]], [[3,4],[5,6]] => [[4,6],[7,9]]")
    void t1() {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] rs = {{4, 6}, {7, 9}};
        assertThat(new Solution().solution(arr1, arr2)).isEqualTo(rs);
    }

    @Test
    @DisplayName("[[1], [2]], [[3], [4]] => [[4], [6]]")
    void t2() {
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};
        int[][] rs = {{4}, {6}};
        assertThat(new Solution().solution(arr1, arr2)).isEqualTo(rs);
    }
}
