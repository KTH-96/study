package study.study.java.java8.interface_method;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class OptionalExTest {

    List<OptionalEx> optionalEx;

    @BeforeEach
    void ex() {
        optionalEx.add(new OptionalEx(1L, "kim", 27, true));
        optionalEx.add(new OptionalEx(2L, "lee", 14, false));
        optionalEx.add(new OptionalEx(3L, "aim", 17, false));
        optionalEx.add(new OptionalEx(4L, "bim", 47, true));
        optionalEx.add(new OptionalEx(5L, "cim", 67, false));
        optionalEx.add(new OptionalEx(6L, "dim", 87, true));
    }

    @Test
    @DisplayName("Optional")
    void optional1() {

    }
}