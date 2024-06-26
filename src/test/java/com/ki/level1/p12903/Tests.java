package com.ki.level1.p12903;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("abcde -> c")
    void t1() {
        assertThat(new Solution().solution("abcde")).isEqualTo("c");
    }

    @Test
    @DisplayName("qwer -> we")
    void t2() {
        assertThat(new Solution().solution("qwer")).isEqualTo("we");
    }
}
