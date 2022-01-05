package study.study.spring.patten.proxy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CacheProxy implements Subject {
    private final Subject subject;
    private String target;


    @Override
    public String operation() {
        log.info("프록시 객체 호출");
        if (target == null) {
            target = subject.operation();
        }
        return target;
    }
}
