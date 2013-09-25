package chapters.chapter11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModeTest {

    @Test
    public void shouldReturnTwoWhenGivenAnArrayContainingTwoTwosAndAOne(){
        int[] array = {2,2,1};
        assertEquals(2, Mode.findMode(array));
    }

    @Test
    public void shouldReturnMostCommonNumberWhenGivenAnArrayOfNumbers(){
        int[] array = {2,3,4,3,3,10,74,2,4,28};
        assertEquals(3, Mode.findMode(array));
    }
}
