package com.ki.level0.p120869;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {
    @Test
    @DisplayName("p, o, s => 2")
    void t1() {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        assertThat(new Solution().solution(spell, dic)).isEqualTo(2);
    }

    @Test
    @DisplayName("z, d, x => 1")
    void t2() {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        assertThat(new Solution().solution(spell, dic)).isEqualTo(1);
    }

    @Test
    @DisplayName("s, o, m, d => 2")
    void t3() {
        String[] spell = {"s", "o", "m", "d"};
        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};
        assertThat(new Solution().solution(spell, dic)).isEqualTo(2);
    }

    @Test
    @DisplayName("z, d, x => 2")
    void t4() {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzxx", "loveaw"};
        assertThat(new Solution().solution(spell, dic)).isEqualTo(2);
    }
}
