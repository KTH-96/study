package study.study.java.java8.lambda;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class FooLambda {
    public static void main(String[] args) {
        FooLambda fooLambda = new FooLambda();
        fooLambda.run();
    }

    private void run() {
        int baseNumber = 10;//로컬 변수가 사실상 final 인경우 참조 가능
//        baseNumber++; 컴파일 에러 발생
        //로컬클래스
        class LocalClass{
            void printBaseNumber() {
                System.out.println(baseNumber);
            }
        }
        //익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };
        //람다 표현식
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };
        printInt.accept(10);
    }
}
