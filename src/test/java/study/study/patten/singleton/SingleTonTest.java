package study.study.patten.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleTonTest {
    @Test
    void 싱글톤() {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        Assertions.assertThat(settings1).isEqualTo(settings2);
    }
}