package inflexible;

public class OutOfRange extends RuntimeException {
    public static final String OUT_OF_RANGE_MESSAGE = "Value is out of range!";

    public OutOfRange(String message) {
        super(message);
    }
}
