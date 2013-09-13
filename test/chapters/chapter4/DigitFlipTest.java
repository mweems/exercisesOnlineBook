package chapters.chapter4;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DigitFlipTest {

        DigitFlip flip = new DigitFlip();

    @Test
    public void return21WhenPassed12(){
        assertEquals(21, flip.flip(12));
    }

     @Test
    public void return9876WhenPassed6789(){
        assertEquals(9876, flip.flip(6789));
     }
}
