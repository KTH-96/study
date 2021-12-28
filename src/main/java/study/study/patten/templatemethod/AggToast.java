package study.study.patten.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AggToast extends Toast{
    @Override
    protected void settingMaterial() {
        log.info("꼐란을 올리고!!");
    }
}

