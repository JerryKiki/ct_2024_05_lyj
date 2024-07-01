package com.ki.level1.p86491;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[[60, 50], [30, 70], [60, 30], [80, 40]] => 4000")
    void t1() {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        assertThat(new Solution().solution(sizes)).isEqualTo(4000);
    }

    @Test
    @DisplayName("[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]] => 120")
    void t2() {
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        assertThat(new Solution().solution(sizes)).isEqualTo(120);
    }

    @Test
    @DisplayName("[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]] => 133")
    void t3() {
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        assertThat(new Solution().solution(sizes)).isEqualTo(133);
    }
}
