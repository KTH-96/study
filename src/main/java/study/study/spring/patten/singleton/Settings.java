package study.study.spring.patten.singleton;

public class Settings {
    private static final Settings instance = new Settings();

    public static Settings getInstance() {
        return instance;
    }

}
