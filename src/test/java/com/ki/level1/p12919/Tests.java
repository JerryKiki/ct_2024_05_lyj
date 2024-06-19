package com.ki.level1.p12919;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("Jane, Kim => 김서방은 1에 있다")
    void t1() {
        String[] arr = new String[] {"Jane", "Kim"};
        assertThat(new Solution().solution(arr)).isEqualTo("김서방은 1에 있다");
    }

    @Test
    @DisplayName("Jecky, Ricky, Jane, Kim => 김서방은 3에 있다")
    void t2() {
        String[] arr = new String[] {"Jecky", "Ricky", "Jane", "Kim"};
        assertThat(new Solution().solution(arr)).isEqualTo("김서방은 3에 있다");
    }

    @Test
    @DisplayName("김서방은 2에 있다")
    void t3() {
        String[] arr = new String[] {"Hack", "Jecky", "Kim", "Jane"};
        assertThat(new Solution().solution(arr)).isEqualTo("김서방은 2에 있다");
    }

}
