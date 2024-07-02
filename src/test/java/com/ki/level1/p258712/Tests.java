package com.ki.level1.p258712;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("goal")
    void t1() {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        assertThat(new Solution().solution(friends, gifts)).isEqualTo(2);
    }

    @Test
    @DisplayName("goal2")
    void t2() {
        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        assertThat(new Solution().solution(friends, gifts)).isEqualTo(4);
    }

    @Test
    @DisplayName("goal3")
    void t3() {
        String[] friends = {"a", "b", "c"};
        String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};
        assertThat(new Solution().solution(friends, gifts)).isEqualTo(0);
    }

    @Test
    @DisplayName("goal4")
    void t4() {
        String[] friends = {"a", "b", "c"};
        String[] gifts = {"a b", "a c", "b c", "b c", "b c", "b c", "b c", "b c", "b c", "b c", "b c", "b c", "b c",
                "b c", "b c", "b c", "b c", "c a",};
        assertThat(new Solution().solution(friends, gifts)).isEqualTo(2);
    }
}
