package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AddCommasTest {

    @Test
    public void shouldReturnNumberStringIfLessThanOrEqualToThreeCharacters(){
        assertEquals("100", AddCommas.addCommasToNumericString("100"));
    }

    @Test
    public void shouldReturnNumberStringWithOneCommaIfFourCharacters(){
        assertEquals("1,123", AddCommas.addCommasToNumericString("1123"));
    }

    @Test
    public void shouldReturnNumberStringWithOneCommaIfSixCharacters(){
        assertEquals("100,000", AddCommas.addCommasToNumericString("100000"));

    }

    @Test
    public void shouldReturnNumberStringWithTwoCommasIfSevenCharacters(){
        assertEquals("1,000,000", AddCommas.addCommasToNumericString("1000000"));
    }
}
