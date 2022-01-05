package study.study.spring.ioc_di;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.study.spring.ioc_di.AppConfig;
import study.study.spring.ioc_di.v4.CarV4;
import study.study.spring.ioc_di.v4.TireV4;

@Slf4j
class IocDiBeanTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    void 빈_정보() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
                log.info("beanDefinitionName = {}, beanDefinition = {}", beanDefinitionName, beanDefinition);
            }
        }
    }

    @BeforeEach
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        tireV4 = appConfig.tireV4();
    }

    TireV4 tireV4;

    @Test
    @DisplayName("수동으로 빈 등록후 타이어 체크")
    void tireBeanCheck() {
        CarV4 carV4 = new CarV4(tireV4);
        String tireBrand = carV4.getTireBrand();
        Assertions.assertThat("한국 타이어").isEqualTo(tireBrand);
    }
}