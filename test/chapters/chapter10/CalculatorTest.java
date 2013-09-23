package chapters.chapter10;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldReturnTheStandardDeviationOfACollectionOfDoubles(){
        assertEquals(2, Calculator.standardDeviation(7.0,3.0),0);
    }
}
