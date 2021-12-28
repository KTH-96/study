package study.study.patten.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeefToast extends Toast {
    @Override
    protected void settingMaterial() {
        log.info("고기를 꿉어 올리고!!");
    }
}
