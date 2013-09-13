package chapters.chapter4;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CountDownTest {

    @Test
    public void countdownFromInputToZero(){
        CountDown count = new CountDown();
        assertEquals("countdown", count.countdown(10));
    }
}
