package study.study.patten.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    @Test
    void noDecorator() {
        Subject subject = new RealSubject();
        Client client = new Client(subject);

        client.execute();
    }

    @Test
    void messageDeco() {
        Subject subject = new RealSubject();
        MessageDecorator messageDecorator = new MessageDecorator(subject);
        Client client = new Client(messageDecorator);

        client.execute();
    }

    @Test
    void timeDeco() {
        Subject subject = new RealSubject();
        TimeDecorator timeDecorator = new TimeDecorator(subject);
        Client client = new Client(timeDecorator);

        client.execute();
    }
}