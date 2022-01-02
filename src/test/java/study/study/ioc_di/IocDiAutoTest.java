package study.study.ioc_di;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.study.ioc_di.v5.CarV5;
import study.study.ioc_di.v5.TireV5;

@Slf4j
public class IocDiAutoTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

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
}
