package flexible;

import inflexible.OutOfRange;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class SpecialNumber extends Number {

    /**
     * A constant holding the minimum value an roman number can
     * have.
     */
    protected static final int MIN_ROMAN_VALUE = 1;

    /**
     * A constant holding the maximum value an roman number can
     * have.
     */
    protected static final int MAX_ROMAN_VALUE = 3999;

    /**
     * Map with all needed values, added in static block.
     */
    private final static Map<Integer, String> romanPossibilities = new LinkedHashMap<>();

    static  {
        romanPossibilities.put(1000, "M");
        romanPossibilities.put(900, "CM");
        romanPossibilities.put(500, "D");
        romanPossibilities.put(400, "CD");
        romanPossibilities.put(100, "C");
        romanPossibilities.put(90, "XC");
        romanPossibilities.put(50, "L");
        romanPossibilities.put(40, "XL");
        romanPossibilities.put(10, "X");
        romanPossibilities.put(9, "IX");
        romanPossibilities.put(5, "V");
        romanPossibilities.put(4, "IV");
        romanPossibilities.put(1, "I");
    }

    protected static String romanValue(int arabicValue) throws OutOfRange {
        int value = arabicValue;
        if(value < MIN_ROMAN_VALUE || value > MAX_ROMAN_VALUE) throw new OutOfRange(OutOfRange.OUT_OF_RANGE_MESSAGE);
        else {
            StringBuilder roman = new StringBuilder();

            for(Map.Entry<Integer, String> entry: romanPossibilities.entrySet()) {
                while (value >= entry.getKey()) {
                    roman.append(entry.getValue());
                    value -= entry.getKey();
                }
            }
            return roman.toString();
        }
    }

    /**
     * Return value field of number object.
     * @return
     */
    protected abstract Object getValue();
}
