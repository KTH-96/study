package study.study.spring.ioc_di.v2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UsaTireV2 implements TireV2 {
    @Override
    public String getBrand() {
        log.info("미국 타이어 메소드");
        return "USA Tire";
    }
}
