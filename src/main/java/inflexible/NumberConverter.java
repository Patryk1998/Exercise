package inflexible;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberConverter {

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

    public String arabicToRoman(int arabicValue) throws OutOfRange {
        if(arabicValue < 1 || arabicValue > 3999) throw new OutOfRange(OutOfRange.OUT_OF_RANGE_MESSAGE);
        else {
            StringBuilder roman = new StringBuilder();

            for(Map.Entry<Integer, String> entry: romanPossibilities.entrySet()) {
                while (arabicValue >= entry.getKey()) {
                    roman.append(entry.getValue());
                    arabicValue -= entry.getKey();
                }
            }
            return roman.toString();
        }
    }
}
