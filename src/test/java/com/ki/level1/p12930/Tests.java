package com.ki.level1.p12930;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("\"try hello world\" => \"TrY HeLlO WoRlD\"")
    void t1() {
        assertThat(new Solution().solution("try hello world")).isEqualTo("TrY HeLlO WoRlD");
    }

    @Test
    @DisplayName("\"mY Dog RICKY is cuTE\" => \"My DoG RiCkY Is CuTe\"")
    void t2() {
        assertThat(new Solution().solution("mY Dog RICKY is cuTE")).isEqualTo("My DoG RiCkY Is CuTe");
    }

    @Test
    @DisplayName("\" mY Dog RICKY is cuTE \" => \" My DoG RiCkY Is CuTe \"")
    void t3() {
        assertThat(new Solution().solution(" mY Dog RICKY  is cuTE ")).isEqualTo(" My DoG RiCkY  Is CuTe ");
    }

    @Test
    @DisplayName("try   hello   world    => TrY   HeLlO   WoRlD   ")
    void t4() {
        assertThat(new Solution().solution("try   hello   world   ")).isEqualTo("TrY   HeLlO   WoRlD   ");
    }

    @Test
    @DisplayName("aaa   => AaA  ")
    void t5() {
        assertThat(new Solution().solution("aaa  ")).isEqualTo("AaA  ");
    }

    @Test
    @DisplayName("aaa   aaa   => AaA   AaA")
    void t6() {
        assertThat(new Solution().solution("aaa   aaa  ")).isEqualTo("AaA   AaA  ");
    }

    @Test
    @DisplayName("aA   a   => Aa   A")
    void t7() {
        assertThat(new Solution().solution("aA   a  ")).isEqualTo("Aa   A  ");
    }
}
