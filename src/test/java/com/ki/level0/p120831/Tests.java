package com.ki.level0.p120831;

import org.assertj.core.api.SoftAssertionError;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("t1")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(30);
    }
    @Test
    @DisplayName("t2")
    void t2() {
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }
    @Test
    @DisplayName("t3")
    void t3() {
        assertThat(new Solution().solution(60)).isEqualTo(930);
    }
    @Test
    @DisplayName("t4")
    void t4() {
        assertThat(new Solution().solution(108)).isEqualTo(2970);
    }
}
