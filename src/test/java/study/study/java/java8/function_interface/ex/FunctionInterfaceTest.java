package study.study.java.java8.function_interface.ex;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class FunctionInterfaceTest {

    @Test
    @DisplayName("Function<T, R>은 T타입을 받아서 R타입을 반환")
    void function() {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply10 = (i) -> i * 10;
        assertThat(plus10.apply(1)).isEqualTo(11);
        assertThat(multiply10.apply(1)).isEqualTo(10);

        //2.compose(1) 숫자는 순서
        Integer multiplyAndPlus = plus10.compose(multiply10).apply(1);//20
        //1.andThen(2)
        Integer plusAndMultiply = plus10.andThen(multiply10).apply(1);//110

        assertThat(multiplyAndPlus).isEqualTo(20);
        assertThat(plusAndMultiply).isEqualTo(110);
    }

    @Test
    @DisplayName("BiFunction<T, U, R>은 두개의 값(T, U)을 받아서 R타입을 반환")
    void biFunction() {
        BiFunction<Integer, Integer, String> intToString10 = (num1, num2) -> String.valueOf(num2 + num1);
        assertThat(intToString10.apply(5, 5)).isEqualTo("10");
    }

    @Test
    @DisplayName("Consumer<T> T타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스")
    void consumer() {
//        Consumer<Integer> reInteger = (i) -> System.out.println(i); 아래와 동일
        Consumer<Integer> reInteger = System.out::println;
        reInteger.accept(10);
    }

    @Test
    @DisplayName("Supplier<T> T 타입의 값을 제공하는 함수 인터페이스")
    void supplier() {
        Supplier<Integer> getInteger = () -> 10;
        assertThat(getInteger.get()).isEqualTo(10);
    }

    @Test
    @DisplayName("Predicate<T> T 타입을 받아서 boolean을 리턴하는 함수 인터페이스")
    void predicate() {
        Predicate<String> startWithKim = (s) -> s.startsWith("Kim");
        Predicate<Integer> isOdd = (i) -> i % 2 == 1;

        assertThat(startWithKim.test("KimTaeHyun")).isTrue();
        assertThat(isOdd.test(3)).isTrue();
    }

    @Test
    @DisplayName("UnaryOperator<T>은 Function<T, R>의 특수한 형태로, T입력값 하나를 받아서 동일한 T타입을 리턴하는 함수 인터페이스")
    void unaryOperator() {
        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        assertThat(plus10.apply(10)).isEqualTo(20);
    }

    @Test
    @DisplayName("BinaryOperator<T>은 BiFunction<T, U, R>의 특수한 형태로, 동일한 타입의 입렵값 두개를 받아 리턴하는 함수 인터페이스")
    void binaryOperator() {
        BinaryOperator<Integer> int10 = (num1, num2) -> (num2 + num1);
        assertThat(int10.apply(5, 5)).isEqualTo(10);
    }
}