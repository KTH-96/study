package study.study.ioc_di.v4;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KoreaTireV4 implements TireV4 {
    @Override
    public String getBrand() {
        log.info("한국 타이어 메소드");
        return "한국 타이어";
    }
}
