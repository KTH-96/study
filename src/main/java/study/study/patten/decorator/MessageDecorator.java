package study.study.patten.decorator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class MessageDecorator implements Subject {
    private final Subject subject;

    @Override
    public String operation() {
        log.info("MessageDecorator 실행");
        String result = subject.operation();
        String decoResult = "~~" + result + "~~";
        log.info("MessageDecorator result = {}, decoResult = {}", result, decoResult);
        return decoResult;
    }
}
