package study.study.ioc_di;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.study.ioc_di.v4.CarV4;
import study.study.ioc_di.v4.KoreaTireV4;
import study.study.ioc_di.v4.TireV4;

@Slf4j
@Configuration
public class AppConfig {

    @Bean
    public CarV4 carV4() {
        log.info("call AppConfig.carV4");
        return new CarV4(tireV4());
    }

    @Bean
    public TireV4 tireV4() {
        log.info("call AppConfig.tireV4");
        return new KoreaTireV4();
        //return new UsaTireV4();
    }
}
