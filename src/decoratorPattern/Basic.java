package decoratorPattern;

@SuppressWarnings("unused")
public class Basic {
    private String value;

    public void set(String val) {
        value = val;
    }

    public String get() {
        return value;
    }
}
