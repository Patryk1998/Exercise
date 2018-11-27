package flexible;

import inflexible.OutOfRange;
import org.junit.Test;

public class SpecialNumberTest {

    @Test
    public void romanValue() {
        //Given && When
        for(int i=1; i<4000; i++) {
            System.out.println(i + " = " + SpecialNumber.romanValue(i));
        }
    }

    @Test(expected = OutOfRange.class)
    public void romanValueOutOfRange() {
        //Given && When
        SpecialNumber.romanValue(4000);
    }
}