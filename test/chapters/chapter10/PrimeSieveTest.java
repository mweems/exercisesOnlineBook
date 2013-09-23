package chapters.chapter10;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PrimeSieveTest {

    @Test
    public void shouldReturnPrimeNumberFromAGroupOfNumbers(){
        assertArrayEquals(new Integer[] {2}, PrimeSieve.primes(2,4,6));
    }

    @Test
    public void shouldReturnMultiplePrimeNumbersFromAGroupOfNumbers(){
        assertArrayEquals(new Integer[]{2, 3}, PrimeSieve.primes(2, 3, 4, 6));
    }
}
