package flexible;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArabicNumberTest {

    @Test
    public void romanValue() {
        //Given
        ArabicNumber arabicNumber = new ArabicNumber(9);
        //When
        String romanValue = arabicNumber.romanValue();
        //Then
        Assert.assertEquals("IX", romanValue);
    }

    @Test
    public void getValue() {
        //Given
        ArabicNumber arabicNumber = new ArabicNumber(4);
        //When
        Integer value = arabicNumber.getValue();
        //Then
        Assert.assertEquals((Integer)4, value);
    }

    @Test
    public void setValue() {
        //Given
        ArabicNumber arabicNumber = new ArabicNumber();
        //When
        arabicNumber.setValue(3);
        //Then
        Assert.assertEquals((Integer)3, arabicNumber.getValue());
    }
}