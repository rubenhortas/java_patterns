package decoratorPattern;

import java.util.Date;

public class TimeStamped extends Decorator {
    private final long timeStamp;

    public TimeStamped(Basic basic) {
        super(basic);
        timeStamp = new Date().getTime();
    }

    @SuppressWarnings("unused")
    public long getStamp() {
        return timeStamp;
    }
}
