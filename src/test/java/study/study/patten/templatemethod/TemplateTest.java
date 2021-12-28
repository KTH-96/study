package study.study.patten.templatemethod;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

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
