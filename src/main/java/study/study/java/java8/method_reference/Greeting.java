package study.study.java.java8.method_reference;

public class Greeting {
    private String name;

    public String getName() {
        return name;
    }

    public Greeting() {
    }

    public Greeting(String name) {
        this.name = name;
    }

    public String hello(String name){
        return "hello " + name;
    }

    public static String hi(String name) {
        return "hi " + name;
    }
}
