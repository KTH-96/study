package study.study.spring.ioc_di.v1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarV1 {
    private TireV1 tire;

    public CarV1() {
        tire = new KoreaTireV1();
    }

    public String getTireBrand() {
        String result = tire.getBrand();
        log.info("사용된 타이어 result = {}", result);
        return result;
    }

}
