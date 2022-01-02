package study.study.ioc_di.v4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class CarV4 {
    private final TireV4 tire;

    @Autowired
    public CarV4(TireV4 tire) {
        this.tire = tire;
    }


    public String getTireBrand() {
        String result = tire.getBrand();
        log.info("사용된 타이어 result = {}", result);
        return result;
    }

}
