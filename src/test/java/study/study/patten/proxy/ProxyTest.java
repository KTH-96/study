package study.study.patten.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {
    @Test
    void noProxy() {
        Subject subject = new RealSubject();
        Client client = new Client(subject);

        client.execute();
        client.execute();
        client.execute();
    }

    @Test
    void proxy() {
        Subject subject = new RealSubject();
        CacheProxy proxy = new CacheProxy(subject);
        Client client = new Client(proxy);

        client.execute();
        client.execute();
        client.execute();
    }
}