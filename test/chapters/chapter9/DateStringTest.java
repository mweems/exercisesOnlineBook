package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DateStringTest {

    @Test
    public void returnAStringWithMonthDateYearWhenPassedThreeInts(){
        assertEquals("22-Oct-82", DateString.dateString(10,22,1982));
    }
}
