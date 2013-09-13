package chapters.chapter5;

import chapters.Chapter5.PrimeNumber;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PrimeNumberTest {

    PrimeNumber prime = new PrimeNumber();

    @Test
    public void returnTrueWhenThePassedInIntIsAPrimeNumber(){
        assertEquals(true, prime.isPrime(17));
    }

    @Test
    public void returnFalseWhenThePassedInIntIsNotAPrimeNumber(){
        assertEquals(false, prime.isPrime(21));
    }
}
