package com.ki.level1.p12925;

import com.ki.level1.p12925.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("1234")
    void t1() {
        assertThat(new Solution().solution("1234")).isEqualTo(1234);
    }
    @Test
    @DisplayName("-1234")
    void t2() {
        assertThat(new Solution().solution("-1234")).isEqualTo(-1234);
    }
}
