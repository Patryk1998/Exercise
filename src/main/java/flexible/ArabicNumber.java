package flexible;

import inflexible.OutOfRange;


public class ArabicNumber extends SpecialNumber {

    /**
     * The value of the ArabicNumber type object.
     */
    private int value;

    /**
     * Constructors
     * @param value
     */
    public ArabicNumber(int value) {
        this.value = value;
    }

    public ArabicNumber() {
        this.value = 0;
    }

    public String romanValue() throws OutOfRange {
        return romanValue(value);
    }

    /**
     * Return value field of number object.
     * @return
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }
    public long longValue() {
        return (long)value;
    }

    public float floatValue() {
        return (float)value;
    }

    public double doubleValue() {
        return (double)value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
