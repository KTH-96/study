package study.study.java.java8.function_interface;

public class Foo {
    public static void main(String[] args) {
        RunSomethingVoid runSomethingVoid = () -> System.out.println("hello");
        RunSomethingInt runSomethingInt = (number) -> number + 10;

        runSomethingVoid.doIt();
        runSomethingInt.doIt(10);//20

    }
}
