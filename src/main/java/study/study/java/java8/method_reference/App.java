package study.study.java.java8.method_reference;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        Function<String, String> hi = Greeting::hi;
        System.out.println(hi.apply("kim"));

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("Kim"));

        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();//get을 해야 객체생성

        Function<String, Greeting> kimGreeting = Greeting::new;
        Greeting kims = kimGreeting.apply("Kims");
        System.out.println(kims.getName());

        String[] names = {"kim", "lee", "bae"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}

