package study.study.spring.ioc_di.v3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsaTireV3 implements TireV3 {
    @Override
    public String getBrand() {
        log.info("미국 타이어 메소드");
        return "USA Tire";
    }
}
