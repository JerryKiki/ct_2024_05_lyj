package com.ki.level0.p120812;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("[1, 2, 3, 3, 3, 4] => 3")
    void t1() {
        int[] arr = new int[] {1, 2, 3, 3, 3, 4};
        assertThat(new Solution().solution(arr)).isEqualTo(3);
    }

    @Test
    @DisplayName("[1, 1, 2, 2] => -1")
    void t2() {
        int[] arr = new int[] {1, 1, 2, 2};
        assertThat(new Solution().solution(arr)).isEqualTo(-1);
    }

    @Test
    @DisplayName("[1] => 1")
    void t3() {
        int[] arr = new int[] {1};
        assertThat(new Solution().solution(arr)).isEqualTo(1);
    }

    @Test
    @DisplayName("[0] => 0")
    void t4() {
        int[] arr = new int[] {0};
        assertThat(new Solution().solution(arr)).isEqualTo(0);
    }

    @Test
    @DisplayName("[1, 1] => 1")
    void t5() {
        int[] arr = new int[] {1, 1};
        assertThat(new Solution().solution(arr)).isEqualTo(1);
    }

    @Test
    @DisplayName("[3, 3, 2, 1] => 3")
    void t6() {
        int[] arr = new int[] {3, 3, 2, 1};
        assertThat(new Solution().solution(arr)).isEqualTo(3);
    }

    @Test
    @DisplayName("[3, 3, 3, 2, 2, 2] => -1")
    void t7() {
        int[] arr = new int[] {3, 3, 3, 2, 2, 2};
        assertThat(new Solution().solution(arr)).isEqualTo(-1);
    }

    @Test
    @DisplayName("[1, 2, 3, 4] => -1")
    void t8() {
        int[] arr = new int[] {1, 2, 3, 4};
        assertThat(new Solution().solution(arr)).isEqualTo(-1);
    }

    @Test
    @DisplayName("[1, 2, 2, 2, 3, 3 ,3] => -1")
    void t9() {
        int[] arr = new int[] {1, 2, 2, 2, 3, 3 ,3};
        assertThat(new Solution().solution(arr)).isEqualTo(-1);
    }

    @Test
    @DisplayName("[12, 12, 1] => 12")
    void t10() {
        int[] arr = new int[] {12, 12, 1};
        assertThat(new Solution().solution(arr)).isEqualTo(12);
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 6, 7, 8] => -1")
    void t11() {
        int[] arr = new int[] {1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 6, 7, 8};
        assertThat(new Solution().solution(arr)).isEqualTo(-1);
    }

    @Test
    @DisplayName("[1, 1, 123] => 1")
    void t12() {
        int[] arr = new int[] {1, 1, 123};
        assertThat(new Solution().solution(arr)).isEqualTo(1);
    }

    @Test
    @DisplayName("[1, 3, 1, 3, 2, 2, 3, 3] => 3")
    void t13() {
        int[] arr = new int[] {1, 3, 1, 3, 2, 2, 3, 3};
        assertThat(new Solution().solution(arr)).isEqualTo(3);
    }

    @Test
    @DisplayName("[0, 0, 0, 0] => 0")
    void t14() {
        int[] arr = new int[] {0, 0, 0, 0};
        assertThat(new Solution().solution(arr)).isEqualTo(0);
    }

    @Test
    @DisplayName("[1, 3, 3, 5, 5, 5, 7, 7, 7, 7] => 7")
    void t15() {
        int[] arr = new int[] {1, 3, 3, 5, 5, 5, 7, 7, 7, 7};
        assertThat(new Solution().solution(arr)).isEqualTo(7);
    }

    @Test
    @DisplayName("[1, 3, 3, 5, 5, 5, 7, 7, 7, 5] => 5")
    void t16() {
        int[] arr = new int[] {1, 3, 3, 5, 5, 5, 7, 7, 7, 5};
        assertThat(new Solution().solution(arr)).isEqualTo(5);
    }

    @Test
    @DisplayName("[1, 2, 2, 3, 3, 4, 4, 7, 7, 7] => 7")
    void t17() {
        int[] arr = new int[] {1, 2, 2, 3, 3, 4, 4, 7, 7, 7};
        assertThat(new Solution().solution(arr)).isEqualTo(7);
    }
}
