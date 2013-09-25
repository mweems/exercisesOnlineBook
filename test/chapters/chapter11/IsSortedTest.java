package chapters.chapter11;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsSortedTest {

    @Test
    public void shouldReturnTrueWhenInputArrayIsSorted(){
        int[] array = {1,2,3,4};
        assertTrue(IsSorted.checkArray(array));
    }

    @Test
    public void shouldReturnFalseWhenInputArrayIsNotSorted(){
        int[] array = {2,1,3,4};
        assertFalse(IsSorted.checkArray(array));
    }
}
