package com.ki.level1.p12910;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("{5, 9, 7, 6}, 5 => 5, 10")
    void t1() {
        int[] inputArr = new int[] {5, 9, 7, 10};
        int[] answerArr = new int[] {5, 10};
        assertThat(Solution.solution(inputArr, 5)).isEqualTo(answerArr);
    }

    @Test
    @DisplayName("{2, 36, 1, 3}, 1 => 1, 2, 3, 36")
    void t2() {
        int[] inputArr = new int[] {2, 36, 1, 3};
        int[] answerArr = new int[] {1, 2, 3, 36};
        assertThat(Solution.solution(inputArr, 1)).isEqualTo(answerArr);
    }

    @Test
    @DisplayName("{3, 2, 6}, 10 => -1")
    void t3() {
        int[] inputArr = new int[] {3, 2, 6};
        int[] answerArr = new int[] {-1};
        assertThat(Solution.solution(inputArr, 10)).isEqualTo(answerArr);
    }

    @Test
    @DisplayName("{11, 13, 17}, 10 => -1")
    void t4() {
        int[] inputArr = new int[] {11, 13, 17};
        int[] answerArr = new int[] {-1};
        assertThat(Solution.solution(inputArr, 10)).isEqualTo(answerArr);
    }

    @Test
    @DisplayName("{3, 2, 6}, 3 => {3, 6}")
    void t5() {
        int[] inputArr = new int[] {3, 2, 6};
        int[] answerArr = new int[] {3, 6};
        assertThat(Solution.solution(inputArr, 3)).isEqualTo(answerArr);
    }
}
