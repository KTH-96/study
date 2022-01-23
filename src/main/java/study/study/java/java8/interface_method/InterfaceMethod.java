package study.study.java.java8.interface_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class InterfaceMethod {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("taehyun");
        names.add("bae");
        names.add("lee");
        names.add("yan");

//        name.forEach((s) -> System.out.println(s));
        names.forEach(System.out::println);
        Spliterator<String> spliterator1 = names.spliterator();
        while (spliterator1.tryAdvance(System.out::println));
    }
}
