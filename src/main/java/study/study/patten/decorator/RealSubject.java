package study.study.patten.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealSubject implements Subject {

    @Override
    public String operation() {
        log.info("실제 로직 실행");
        return "data";
    }
}
