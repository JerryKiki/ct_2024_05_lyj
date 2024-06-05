package com.ki.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//        System.out.println(new Solution().solution(2, 3));
//        System.out.println(new Solution().solution(11, 11));
//        System.out.println(new Solution().solution(7, 99));

public class Tests {
    @Test
    @DisplayName("")
    void t1(){
        assertThat(new Solution().solution(2, 3)).isEqualTo(-1);
    }

    @Test
    @DisplayName("")
    void t2(){
        assertThat(new Solution().solution(11, 11)).isEqualTo(1);
    }

    @Test
    @DisplayName("")
    void t3(){
        assertThat(new Solution().solution(7, 99)).isEqualTo(-1);
    }
}
