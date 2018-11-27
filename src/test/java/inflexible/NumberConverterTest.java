package inflexible;

import org.junit.Test;

public class NumberConverterTest {

    @Test
    public void arabicToRoman() {
        //Given
        NumberConverter numberConverter = new NumberConverter();

        //When
        for(int i=1; i<4000; i++) {
            System.out.println(i + " = " + numberConverter.arabicToRoman(i));
        }
        //Then
    }

    @Test(expected = OutOfRange.class)
    public void romanValueOutOfRange() {
        //Given
        NumberConverter numberConverter = new NumberConverter();

        //When
        numberConverter.arabicToRoman(4000);
    }
}