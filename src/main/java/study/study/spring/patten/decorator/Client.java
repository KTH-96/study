package study.study.spring.patten.decorator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class Client {
    private final Subject subject;

    public void execute() {
        String result = subject.operation();
        log.info("result = {}", result);
    }
}
