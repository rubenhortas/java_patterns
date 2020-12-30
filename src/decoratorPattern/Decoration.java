package decoratorPattern;

public class Decoration {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        TimeStamped t = new TimeStamped(new Basic());
        TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
        // t2.getSerialNumber(); // Not available

        SerialNumbered s = new SerialNumbered(new Basic());
        SerialNumbered s2 = new SerialNumbered(new TimeStamped(new Basic()));
        // s2.getStamp(); // Not available
    }
}
