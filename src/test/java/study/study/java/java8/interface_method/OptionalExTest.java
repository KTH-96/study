package study.study.java.java8.interface_method;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class OptionalExTest {

    List<OptionalEx> optionalEx = new ArrayList<>();

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
    @DisplayName("Optional get")
    void optional1() {
        Optional<OptionalEx> findM = optionalEx.stream()
                .filter(s -> s.getName().startsWith("m", 2))
                .findFirst();

        log.info("findM first = {}", findM.get().getName());
        assertThat(findM.isPresent()).isTrue();
    }

    @Test
    @DisplayName("Optional ifPresent")
    void optional2() {
        Optional<OptionalEx> findM = optionalEx.stream()
                .filter(s -> s.getName().startsWith("m", 2))
                .findFirst();
        //Consumer
        findM.ifPresent(s -> log.info("findM name ={}", s.getName()));
    }
}