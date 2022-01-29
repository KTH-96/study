package study.study.java.oop.ex1;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.setChannel(7);
        tv.channelDown();
        System.out.println(tv.getChannel());

    }
}
