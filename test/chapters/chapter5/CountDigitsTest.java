package chapters.chapter5;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CountDigitsTest {

    CountDigits count = new CountDigits();

    @Test
    public void returnOneWhenPassedASingleDigit(){
        assertEquals(1, count.nDigits(1));
    }

    @Test
    public void returnTwoWhenPassedTwoDigits(){
        assertEquals(2, count.nDigits(21));
    }
}
