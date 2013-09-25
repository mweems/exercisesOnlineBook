package chapters.chapter11;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AlphabetizeTest {

    @Test
    public void shouldReturnASortedArrayOfStrings(){
        String[] array = {"Music","Art","Science","Religion"};
        String[] expected = {"Art","Music","Religion","Science"};
        assertTrue(Arrays.equals(expected, Alphabetize.sort(array)));
    }
}
