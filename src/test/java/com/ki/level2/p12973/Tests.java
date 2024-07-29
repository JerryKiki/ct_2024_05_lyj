package com.ki.level2.p12973;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("baabaa => 1")
    void t1() {
        assertThat(new Solution().solution("baabaa")).isEqualTo(1);
    }

    @Test
    @DisplayName("cdcd => 0")
    void t2() {
        assertThat(new Solution().solution("cdcd")).isEqualTo(0);
    }

    @Test
    @DisplayName("bacbac => 0")
    void t3() {
        assertThat(new Solution().solution("bacbac")).isEqualTo(0);
    }

    @Test
    @DisplayName("abbaccadda => 1")
    void t4() {
        assertThat(new Solution().solution("abbaccadda")).isEqualTo(1);
    }

    @Test
    @DisplayName("abbaccadd => 0")
    void t5() {
        assertThat(new Solution().solution("abbaccadd")).isEqualTo(0);
    }

    @Test
    @DisplayName("acbbcbbaccadda => 1")
    void t6() {
        assertThat(new Solution().solution("acbbcbbaccadda")).isEqualTo(1);
    }

    @Test
    @DisplayName("abbaabba => 1")
    void t7() {
        assertThat(new Solution().solution("abbaabba")).isEqualTo(1);
    }

    @Test
    @DisplayName("ccccc => 0")
    void t8() {
        assertThat(new Solution().solution("ccccc")).isEqualTo(0);
    }

    @Test
    @DisplayName("cccccaacbbbbbcbc => 0")
    void t9() {
        assertThat(new Solution().solution("cccccaacbbbbbcbc")).isEqualTo(0);
    }
}
