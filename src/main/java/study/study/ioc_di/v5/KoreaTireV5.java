package study.study.ioc_di.v5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Slf4j
@Qualifier("koreaTire")
@Service
public class KoreaTireV5 implements TireV5 {
    @Override
    public String getBrand() {
        log.info("한국 타이어 메소드");
        return "한국 타이어";
    }
}
