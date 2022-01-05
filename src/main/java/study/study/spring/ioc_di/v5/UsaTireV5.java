package study.study.spring.ioc_di.v5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Qualifier("usaTire")
@Component
public class UsaTireV5 implements TireV5 {
    @Override
    public String getBrand() {
        log.info("미국 타이어 메소드");
        return "USA Tire";
    }
}
