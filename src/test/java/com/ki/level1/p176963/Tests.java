package com.ki.level1.p176963;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("19, 15, 6")
    void t1() {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] phtho = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = {19, 15, 6};
        assertThat(new Solution().solution(name, yearning, phtho)).isEqualTo(answer);
    }

    @Test
    @DisplayName("67, 0, 55")
    void t2() {
        String[] name = {"kali", "mari", "don"};
        int[] yearning = {11, 1, 55};
        String[][] phtho = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
        int[] answer = {67, 0, 55};
        assertThat(new Solution().solution(name, yearning, phtho)).isEqualTo(answer);
    }

    @Test
    @DisplayName("5, 15, 0")
    void t3() {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] phtho = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};
        int[] answer = {5, 15, 0};
        assertThat(new Solution().solution(name, yearning, phtho)).isEqualTo(answer);
    }
}
