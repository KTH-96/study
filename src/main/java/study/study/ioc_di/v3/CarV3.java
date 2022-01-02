package study.study.ioc_di.v3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarV3 {
    TireV3 tire;

    public TireV3 getTire() {
        return tire;
    }

    public void setTire(TireV3 tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        String result = tire.getBrand();
        log.info("사용된 타이어 result = {}", result);
        return result;
    }

}
