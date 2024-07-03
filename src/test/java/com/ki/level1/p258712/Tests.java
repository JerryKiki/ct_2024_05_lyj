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

    @Test
    @DisplayName("goal5")
    void t5() {
        String[] friends = {"a", "b", "c", "d", "e"};
        String[] gifts = {"a b", "a b", "a b", "a b", "a b"}; //a: 4개, b 0개, 나머지 1개씩
        assertThat(new Solution().solution(friends, gifts)).isEqualTo(4);
    }

    @Test
    @DisplayName("goal6")
    void t6() {
        String[] friends = {"a", "b", "c", "d", "e"};
        String[] gifts = {"a b", "a b", "b c", "b c", "c d", "c d", "d e", "d e", "e a", "e a", "a e", "b a"};
        assertThat(new Solution().solution(friends, gifts)).isEqualTo(3);
    }

    @Test
    @DisplayName("goal7")
    void t7() {
        String[] friends = {"a", "b", "c"};
        String[] gifts = {"a b", "b a"};
        assertThat(new Solution().solution(friends, gifts)).isEqualTo(0);
    }

    @Test
    @DisplayName("goal8")
    void t8() {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"frodo ryan", "neo muzi"};
        assertThat(new Solution().solution(friends, gifts)).isEqualTo(2);
        //선물지수 : 무지 -1, 라이언 -1, 프로도 1, 네오 1
        //받는수 : 무지>0, 라이언>0, 프로도>2, 네오>2
    }

    @Test
    @DisplayName("goal9")
    void t9() {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"frodo ryan"};
        assertThat(new Solution().solution(friends, gifts)).isEqualTo(3);
        //선물지수 : 무지 0, 라이언 -1, 프로도 1, 네오 0
        //받는수 : 무지>1, 라이언>0, 프로도>3, 네오>1
    }
}
