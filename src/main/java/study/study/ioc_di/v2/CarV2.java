package study.study.ioc_di.v2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarV2 {
    private final TireV2 tire;

    public CarV2(TireV2 tire) {
        this.tire = tire;
    }


    public String getTireBrand() {
        String result = tire.getBrand();
        log.info("사용된 타이어 result = {}", result);
        return result;
    }

}
