package study.study.spring.patten.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Toast {

    public final void makeToast() {
        settingBread();
        settingMaterial();
        packaging();
    }

    private void packaging() {
        log.info("포장 하기!!");
    }

    protected abstract void settingMaterial();

    private void settingBread() {
        log.info("빵을 올리고!!");
    }
}
