package study.study.spring.patten.templatemethod;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import study.study.spring.patten.templatemethod.AggToast;
import study.study.spring.patten.templatemethod.BeefToast;
import study.study.spring.patten.templatemethod.Toast;

@Slf4j
public class TemplateTest {

    @Test
    void 템플릿_메서드() {
        Toast agg = new AggToast();
        agg.makeToast();
        log.info("구분구분=====");
        Toast beef = new BeefToast();
        beef.makeToast();
    }
}
