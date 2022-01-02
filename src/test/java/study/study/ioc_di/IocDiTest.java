package study.study.ioc_di;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.study.ioc_di.v1.CarV1;
import study.study.ioc_di.v2.CarV2;
import study.study.ioc_di.v2.KoreaTireV2;
import study.study.ioc_di.v2.TireV2;
import study.study.ioc_di.v2.UsaTireV2;
import study.study.ioc_di.v3.CarV3;
import study.study.ioc_di.v3.KoreaTireV3;
import study.study.ioc_di.v3.TireV3;
import study.study.ioc_di.v3.UsaTireV3;

import static org.assertj.core.api.Assertions.assertThat;

class IocDiTest {

    @Test
    @DisplayName("의존성 주입없이 타이어 확인")
    void tireCheck1() {
        CarV1 car = new CarV1();
        String tireBrand = car.getTireBrand();
        assertThat("한국 타이어").isEqualTo(tireBrand);
    }

    @Test
    @DisplayName("생성자로 의존성 주입시 타이어 확인")
    void tireCheck2() {
        TireV2 tire1 = new KoreaTireV2();
        CarV2 car1 = new CarV2(tire1);
        String tireBrand1 = car1.getTireBrand();
        assertThat("한국 타이어").isEqualTo(tireBrand1);

        TireV2 tire2 = new UsaTireV2();
        CarV2 car2 = new CarV2(tire2);
        String tireBrand2 = car2.getTireBrand();
        assertThat("USA Tire").isEqualTo(tireBrand2);
    }

    @Test
    @DisplayName("속성으로 의존성 주입시 타이어 확인")
    void tireCheck3() {
        TireV3 tire1 = new KoreaTireV3();
        CarV3 car1 = new CarV3();
        car1.setTire(tire1);

        String tireBrand1 = car1.getTireBrand();
        assertThat("한국 타이어").isEqualTo(tireBrand1);

        TireV3 tire2 = new UsaTireV3();
        CarV3 car2 = new CarV3();
        car2.setTire(tire2);

        String tireBrand2 = car2.getTireBrand();
        assertThat("USA Tire").isEqualTo(tireBrand2);
    }
}