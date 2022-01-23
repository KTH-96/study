package study.study.java.java8.interface_method;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class InterfaceMethodTest {

    List<String> names;
    @BeforeEach
    void init() {
        names = new ArrayList<>();
        names.add("taehyun");
        names.add("bae");
        names.add("lee");
        names.add("yan");
    }
    @Test
    void forEach(){
//        names.forEach(System.out::println);도 가능
        names.forEach(s -> log.info("name = {}", s));
    }

    @Test
    @DisplayName("spliterator은 순서를 보장하지 않습니다.")
    void spliterator() {
        Spliterator<String> spliterator1 = names.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        while (spliterator1.tryAdvance(s -> log.info("spliterator names1 = {}", s)));
        log.info("===============");
        while (spliterator2.tryAdvance(s -> log.info("spliterator names1 = {}", s)));
    }

    @Test
    void stream() {
        names.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("T"))
                .collect(Collectors.toList())
                .forEach(s -> log.info("stream result = {}", s));
    }

    @Test
    @DisplayName("removeIf는 조건에 맞은 값을 제거")
    void removeIf() {
        names.removeIf(s -> s.startsWith("t"));
        names.forEach(s -> log.info("result = {}", s));
    }
}