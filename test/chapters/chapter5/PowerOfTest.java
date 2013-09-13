package chapters.chapter5;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PowerOfTest {

        PowerOf raise = new PowerOf();

    @Test
    public void returnTwoToThePowerOfTwo(){
        assertEquals(4.0, raise.toThePowerOf(2,2));
    }

    @Test
    public void returnProperlyIfNumberToRaiseToIsNegative(){
       assertEquals(0.25, raise.toThePowerOf(2,-2));
    }
}
