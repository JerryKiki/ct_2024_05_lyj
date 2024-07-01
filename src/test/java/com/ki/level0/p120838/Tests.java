package com.ki.level0.p120838;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName(".... . .-.. .-.. --- => hello")
    void t1() {
        assertThat(new Solution().solution(".... . .-.. .-.. ---")).isEqualTo("hello");
    }

    @Test
    @DisplayName(".--. -.-- - .... --- -. => python")
    void t2() {
        assertThat(new Solution().solution(".--. -.-- - .... --- -.")).isEqualTo("python");
    }

    @Test
    @DisplayName(".-. .. -.-. -.- -.-- => ricky")
    void t3() {
        assertThat(new Solution().solution(".-. .. -.-. -.- -.--")).isEqualTo("ricky");
    }

    @Test
    @DisplayName(".--- . -.-. -.- -.-- => jecky")
    void t4() {
        assertThat(new Solution().solution(".--- . -.-. -.- -.--")).isEqualTo("jecky");
    }

    @Test
    @DisplayName(".--- . .-. .-. -.-- => jerry")
    void t5() {
        assertThat(new Solution().solution(".--- . .-. .-. -.--")).isEqualTo("jerry");
    }


}
