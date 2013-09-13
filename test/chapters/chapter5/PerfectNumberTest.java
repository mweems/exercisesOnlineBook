package chapters.chapter5;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PerfectNumberTest {

    PerfectNumber number = new PerfectNumber();

    @Test
    public void returnTrueWhenPassedAPerfectNumber(){
        assertEquals(true, number.isPerfect(6));
    }

    @Test
    public void returnFalseWhenPassedANonPerfectNumber(){
        assertEquals(false, number.isPerfect(21));
    }

    @Test
    public void returnPerfectNumbersFoundInARange(){
        assertEquals(new int[] {6,28,496,8128}, number.findPerfect(1,9999));
    }
}
