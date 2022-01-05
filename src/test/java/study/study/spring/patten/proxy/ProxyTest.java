package study.study.spring.patten.proxy;

import org.junit.jupiter.api.Test;
import study.study.spring.patten.proxy.CacheProxy;
import study.study.spring.patten.proxy.Client;
import study.study.spring.patten.proxy.RealSubject;
import study.study.spring.patten.proxy.Subject;

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