package com.ki.level1.p12948;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("01033334444 => *******4444")
    void t1() {
        assertThat(Solution.solution("01033334444")).isEqualTo("*******4444");
    }

    @Test
    @DisplayName("027778888 => *****8888")
    void t2() {
        assertThat(Solution.solution("027778888")).isEqualTo("*****8888");
    }

    @Test
    @DisplayName("0423968888 => ******8888")
    void t3() {
        assertThat(Solution.solution("0423968888")).isEqualTo("******8888");
    }

    @Test
    @DisplayName("01088889999111888892 => ****************8892")
    void t4() {
        assertThat(Solution.solution("01088889999111888892")).isEqualTo("****************8892");
    }
}
