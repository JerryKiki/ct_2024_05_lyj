package com.ki.level1.p92334;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("goal1")
    void t1() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int[] result = {2, 1, 1, 0};
        assertThat(new Solution().solution(id_list, report, 2)).isEqualTo(result);
    }

    @Test
    @DisplayName("goal2")
    void t2() {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int[] result = {0, 0};
        assertThat(new Solution().solution(id_list, report, 3)).isEqualTo(result);
    }

    @Test
    @DisplayName("goal3")
    void t3() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","muzi frodo", "muzi frodo", "muzi frodo", "apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int[] result = {2, 1, 1, 0};
        assertThat(new Solution().solution(id_list, report, 2)).isEqualTo(result);
    }

    @Test
    @DisplayName("goal4")
    void t4() {
        String[] id_list = {"a", "b", "c", "d"};
        String[] report = {"a b", "a b", "c a", "d a", "a b", "c d", "a d", "b c", "b a", "d a"};
        int[] result = {1, 1, 2, 1};
        assertThat(new Solution().solution(id_list, report, 2)).isEqualTo(result);
    }

    @Test
    @DisplayName("goal5")
    void t5() {
        String[] id_list = {"a", "ab", "abc", "b"};
        String[] report = {"ab a", "abc a", "b a", "a ab", "abc ab", "b ab"};
        int[] result = {1, 1, 2, 2};
        assertThat(new Solution().solution(id_list, report, 2)).isEqualTo(result);
    }

    @Test
    @DisplayName("goal6")
    void t6() {
        String[] id_list = {"ab", "b"};
        String[] report = {"ab b"};
        int[] result = {1, 0};
        assertThat(new Solution().solution(id_list, report, 1)).isEqualTo(result);
    }

    @Test
    @DisplayName("goal7")
    void t7() {
        String[] id_list = {"a", "ab", "abc", "b"};
        String[] report = {"ab a", "ab abc", "ab b", "abc a", "abc ab", "abc b"};
        int[] result = {0, 2, 2, 0};
        assertThat(new Solution().solution(id_list, report, 2)).isEqualTo(result);
    }
}
