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
    @DisplayName("cccccaacbcbc => 0")
    void t9() {
        assertThat(new Solution().solution("cccccaacbbbbbcbc")).isEqualTo(0);
    }

    @Test
    @DisplayName("abaab => 0")
    void t10() {
        assertThat(new Solution().solution("cccccaacbbbbbcbc")).isEqualTo(0);
    }

    @Test
    @DisplayName("akjhlaksjhaflksjhfksjdhfkja => 0")
    void t11() {
        assertThat(new Solution().solution("akjhlaksjhaflksjhfksjdhfkja")).isEqualTo(0);
    }

    @Test
    @DisplayName("abccba => 1")
    void t12() {
        assertThat(new Solution().solution("abccba")).isEqualTo(1);
    }

    @Test
    @DisplayName("abcccba=> 0")
    void t13() {
        assertThat(new Solution().solution("abcccba")).isEqualTo(0);
    }

    @Test
    @DisplayName("abccccbaaa=> 1")
    void t14() {
        assertThat(new Solution().solution("abccccbaaa")).isEqualTo(1);
    }

    @Test
    @DisplayName("abccaabaa => 0")
    void t16() {
        assertThat(new Solution().solution("abccaabaa")).isEqualTo(0);
    }

    @Test
    @DisplayName("a => 0")
    void t17() {
        assertThat(new Solution().solution("a")).isEqualTo(0);
    }

    @Test
    @DisplayName("kbaabcck => 1")
    void t18() {
        assertThat(new Solution().solution("kbaabcck")).isEqualTo(1);
    }

    @Test
    @DisplayName("abbbaaba => 1")
    void t19() {
        assertThat(new Solution().solution("abbbaaba")).isEqualTo(1);
    }

    @Test
    @DisplayName("aassddssffdddffdddfaassfassddaaaaasddsddaassfaaaafss => 1")
    void t20() {
        assertThat(new Solution().solution("aassddssffdddffdddfaassfassddaaaaasddsddaassfaaaafss")).isEqualTo(1);
    }
}
