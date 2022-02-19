package study.study.java.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringBuilderTest {

    @Test
    @DisplayName("append 사용")
    void StringBuilderTest1() {
        assertThat(createMessage(14)).isEqualTo("백엔드 수강생은? 14 명이다.");
    }

    private String createMessage(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("백엔드 수강생은? ").append(i).append(" 명이다.");
        return sb.toString();
    }
}
