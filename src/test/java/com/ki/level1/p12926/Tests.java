package com.ki.level1.p12926;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("AB, 1 => BC")
    void t1() {
        assertThat(new Solution().solution("AB", 1)).isEqualTo("BC");
    }

    @Test
    @DisplayName("z, 1 => a")
    void t2() {
        assertThat(new Solution().solution("z", 1)).isEqualTo("a");
    }

    @Test
    @DisplayName("a B z, 4 => e F d")
    void t3() {
        assertThat(new Solution().solution("a B z", 4)).isEqualTo("e F d");
    }
}
