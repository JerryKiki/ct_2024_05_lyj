package com.ki.level1.p12917;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("Zbcdefg => gfedcbZ")
    void t1() {
        assertThat(new Solution().solution("Zbcdefg")).isEqualTo("gfedcbZ");
    }

    @Test
    @DisplayName("dabCe => edbaC")
    void t2() {
        assertThat(new Solution().solution("dabCe")).isEqualTo("edbaC");
    }
}
