package study.study.spring.patten.decorator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TimeDecorator implements Subject {
    private final Subject subject;
    @Override
    public String operation() {
        log.info("TimeDecorator 실행");
        long startTime = System.currentTimeMillis();
        String result = subject.operation();
        long endTime = System.currentTimeMillis();
        log.info("TimeDecorator 종료 resultTime = {}ms", endTime - startTime);
        return result;
    }
}
