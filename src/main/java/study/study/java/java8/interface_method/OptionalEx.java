package study.study.java.java8.interface_method;

import java.util.Optional;

public class OptionalEx {
    private Long id;
    private String name;
    private int age;
    private boolean tf;
    private Info info;

    public OptionalEx(Long id, String name, int age, boolean tf) {
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

    public Optional<Info> getInfo() {
        return Optional.ofNullable(info);
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
