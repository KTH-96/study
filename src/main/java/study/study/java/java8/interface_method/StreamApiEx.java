package study.study.java.java8.interface_method;

public class StreamApiEx {
    private Long id;
    private String name;
    private int age;
    private boolean tf;

    public StreamApiEx(Long id, String name, int age, boolean tf) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tf = tf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTf() {
        return tf;
    }

    public void setTf(boolean tf) {
        this.tf = tf;
    }
}
