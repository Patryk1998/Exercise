package flexible;

public class RomanNumber extends SpecialNumber {

    /**
     * The value of the RomanNumber type object.
     */
    private String value;

    /**
     * Constructors
     * @param value
     */
    public RomanNumber(String value) {
        this.value = value;
    }

    public RomanNumber(int value) {
        this.value = romanValue(value);
    }

    public RomanNumber() {
        this.value = null;
    }

    /**
     * Return value field of number object.
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * These methods need converting roman number for arabic.
     * @return
     */
    public int intValue() {
        return 0;
    }
    public long longValue() {
        return 0;
    }

    public float floatValue() {
        return 0;
    }

    public double doubleValue() {
        return 0;
    }
}
