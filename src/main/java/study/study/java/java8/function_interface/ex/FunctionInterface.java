package study.study.java.java8.function_interface.ex;

import java.util.function.*;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply10 = (i) -> i * 10;
        BiFunction<Integer, Integer, String> intToString10 = (num1, num2) -> String.valueOf(num2 + num1);
        Consumer<Integer> reInteger = System.out::println;
        Supplier<Integer> getInteger = () -> 10;
        Predicate<String> startWithKim = (s) -> s.startsWith("Kim");
        UnaryOperator<Integer> plusSameType10 = (i) -> i + 10;
        BinaryOperator<Integer> int10 = (num1, num2) -> (num2 + num1);
    }
}
