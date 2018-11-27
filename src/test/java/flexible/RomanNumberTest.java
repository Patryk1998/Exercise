package flexible;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberTest {

    @Test
    public void getValue() {
        //Given
        RomanNumber romanNumber = new RomanNumber("XX");

        //When
        String value = romanNumber.getValue();

        //Then
        Assert.assertEquals("XX", value);
    }
}