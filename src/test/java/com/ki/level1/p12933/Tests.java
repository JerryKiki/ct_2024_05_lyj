package com.ki.level1.p12933;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("118372 => 873211")
    void t1() {
        assertThat(new Solution().solution(118372)).isEqualTo(873211);
    }

    @Test
    @DisplayName("948012 => 984210")
    void t2() {
        assertThat(new Solution().solution(948012)).isEqualTo(984210);
    }
}
