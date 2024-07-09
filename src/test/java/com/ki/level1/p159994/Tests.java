package com.ki.level1.p159994;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("goal 1")
    void t1() {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        assertThat(new Solution().solution(cards1, cards2, goal)).isEqualTo("Yes");
    }

    @Test
    @DisplayName("goal 2")
    void t2() {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        assertThat(new Solution().solution(cards1, cards2, goal)).isEqualTo("No");
    }

    @Test
    @DisplayName("goal 3")
    void t3() {
        String[] cards1 = {"i", "my", "me", "mine", "she"};
        String[] cards2 = {"love", "myself"};
        String[] goal = {"i", "love", "myself"};
        assertThat(new Solution().solution(cards1, cards2, goal)).isEqualTo("Yes");
    }
}
