package study.study.java.java8.interface_method;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class StreamTest {

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
    @DisplayName("스트림이 처리하는 데이터는 소스를 변경하지않는다")
    void source() {
        Stream<String> stringStream = names.stream().map(String::toUpperCase);

        names.forEach(s -> log.info("stream후 원본데이터 결과들 = {}", s));

        stringStream.forEach(s -> log.info("stream후 리턴값을 가져온것 ={}", s));
    }
}
