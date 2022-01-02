package study.study.ioc_di.v5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CarV5 {
    private final TireV5 tire;

    @Autowired
    public CarV5(@Qualifier("usaTire") TireV5 tire) {
        this.tire = tire;
    }


    public String getTireBrand() {
        String result = tire.getBrand();
        log.info("사용된 타이어 result = {}", result);
        return result;
    }

}
