package study.study.java.java8.interface_method;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class StreamTest {

    List<String> names;
    List<StreamApiEx> listA;
    List<StreamApiEx> listB;
    List<List<StreamApiEx>> list;

    @BeforeEach
    void init() {
        names = new ArrayList<>();
        names.add("taehyun");
        names.add("bae");
        names.add("lee");
        names.add("yan");

        listA = new ArrayList<>();
        listA.add(new StreamApiEx(1L, "kim", 27, true));
        listA.add(new StreamApiEx(2L, "lee", 14, true));
        listA.add(new StreamApiEx(3L, "yan", 27, false));
        listA.add(new StreamApiEx(4L, "bae", 32, false));
        listA.add(new StreamApiEx(5L, "o", 48, true));
        listA.add(new StreamApiEx(6L, "kimtaehyun", 99, false));

        listB = new ArrayList<>();
        listB.add(new StreamApiEx(7L, "sdfhjsdiu", 27, false));
        listB.add(new StreamApiEx(8L, "tyqwet", 47, false));
        listB.add(new StreamApiEx(9L, "mnbv", 77, false));

        list = new ArrayList<>();
        list.add(listA);
        list.add(listB);
    }

    @Test
    @DisplayName("스트림이 처리하는 데이터는 소스를 변경하지않는다")
    void source() {
        Stream<String> stringStream = names.stream().map(String::toUpperCase);

        names.forEach(s -> log.info("stream후 원본데이터 결과들 = {}", s));

        stringStream.forEach(s -> log.info("stream후 리턴값을 가져온것 ={}", s));
    }

    @Test
    @DisplayName("filter")
    void streamApi1() {
        listA.stream()
                .filter(a -> a.getName().startsWith("kim"))
                .forEach(list -> log.info("이름이 kim으로 시작하는 사람 = {}", list.getName()));

        listA.stream()
                .filter(a -> a.getAge() >= 30)
                .forEach(list -> log.info("나이가 30이상인 사람 = {}", list.getName()));

        listA.stream()
                .filter(Predicate.not(StreamApiEx::isTf))
                .forEach(list -> log.info("그냥 false인사람 = {}", list.getName()));
    }

    @Test
    @DisplayName("map")
    void streamApi2() {
        listA.stream()
                .map(StreamApiEx::getAge)
                .forEach(i -> log.info("나이만 모으기 = {}", i));
        List<Integer> ageList = listA.stream()
                .map(StreamApiEx::getAge)
                .collect(Collectors.toList());
        ageList.forEach(i -> log.info("나이만 모으기 리스트형식으로 = {}", i));

        list.stream().flatMap(fList -> fList.stream())
                .forEach(name -> log.info("두개의 리스트의 이름들을 다가져옴 = {}", name.getName()));
    }

    @Test
    @DisplayName("생성, 제한")
    void streamApi3() {
        Stream.iterate(10, i -> i + 1)
                .skip(10)
                .limit(10)
                .forEach(i -> log.info("20부터 1씩 증가해 29까지 받기 = {}", i));
    }
}
