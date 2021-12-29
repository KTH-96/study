package study.study.patten.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {
    private final Subject subject;

    public void execute() {
        subject.operation();
    }
}
