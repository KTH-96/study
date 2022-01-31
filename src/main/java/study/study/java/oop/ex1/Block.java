package study.study.java.oop.ex1;

public class Block {
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }

}
