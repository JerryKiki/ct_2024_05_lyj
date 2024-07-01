package com.ki.level1.p133499;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("\"aya\", \"yee\", \"u\", \"maa\" -> 1")
    void t1() {
        String[] arr = {"aya", "yee", "u", "maa"};
        assertThat(new Solution().solution(arr)).isEqualTo(1);
    }

    @Test
    @DisplayName("\"ayaye\", \"uuu\", \"yeye\", \"yemawoo\", \"ayaayaa\" -> 2")
    void t2() {
        String[] arr = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        assertThat(new Solution().solution(arr)).isEqualTo(2);
    }

    @Test
    @DisplayName("\"yeayaye\", \"mawooma\", \"ayayemaaya\", \"woyeo\" -> 3")
    void t3() {
        String[] arr = {"yeayaye", "mawooma", "ayayemaaya", "woyeo"};
        assertThat(new Solution().solution(arr)).isEqualTo(3);
    }


}
