package com.ki.level2.p12946;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("2 => [[1,2], [1,3], [2,3]]")
    void t1() {
        int[][] rs = new int[][] {{1,2},{1,3},{2,3}};
        assertThat(new Solution().solution(2)).isEqualTo(rs);
    }
}
