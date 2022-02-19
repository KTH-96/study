package study.study.java.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {
    @Test
    @DisplayName("문자열_길이_구하기")
    void StringTest1() {
        String name = "김태현";
        assertThat(name.length()).isEqualTo(3);
    }
    @Test
    @DisplayName("문자열_더하기")
    void StringTest2() {
        String name = "김태현 ";
        String hello = "안뇽";
        assertThat(name + hello).isEqualTo("김태현 안뇽");
    }
    @Test
    @DisplayName("문자열_문자_단위_출력")
    void StringTest3() {
        String name = "김태현";
        char[] chars = name.toCharArray();
        assertAll(
                () -> assertEquals('김', chars[0]),
                () -> assertEquals('태', chars[1]),
                () -> assertEquals('현', chars[2])
        );
    }
    @Test
    @DisplayName("문자열_뒤집기")
    void StringTest4() {
        String name = "김태현";
        StringBuilder sb = new StringBuilder(name);
        assertThat("현태김").isEqualTo(sb.reverse().toString());
    }
}
