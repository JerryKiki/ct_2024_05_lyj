package com.ki.level2.p12909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("()()")
    void t1() {
        assertThat(new Solution().solution("()()")).isEqualTo(true);
    }

    @Test
    @DisplayName("(())()")
    void t2() {
        assertThat(new Solution().solution("(())()")).isEqualTo(true);
    }

    @Test
    @DisplayName(")()(")
    void t3() {
        assertThat(new Solution().solution(")()(")).isEqualTo(false);
    }

    @Test
    @DisplayName("(()(")
    void t4() {
        assertThat(new Solution().solution("(()(")).isEqualTo(false);
    }

    @Test
    @DisplayName("())(()")
    void t5() {
        assertThat(new Solution().solution("())(()")).isEqualTo(false);
    }
}
