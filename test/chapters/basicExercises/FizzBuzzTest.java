package chapters.basicExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturnOneWhenGivenARangeOfOne(){
        assertEquals("1", fizzBuzz.numbers(1,1));
    }

    @Test
    public void shouldReturnONeAndTwoWhenGivenARangeOfTwo(){
        assertEquals("1\n2", fizzBuzz.numbers(1,2));
    }

    @Test
    public void shouldReturnOneTwoFizzWhenGivenARangeOfThree(){
        assertEquals("1\n2\nFizz", fizzBuzz.numbers(1,3));
    }

    @Test
    public void shouldReturnBuzzInsteadOfFiveWhenGivenARangeOfFive(){
        assertEquals("1\n2\nFizz\n4\nBuzz", fizzBuzz.numbers(1,5) );
    }

    @Test
    public void shouldReturnFizzBuzzInsteadOfFifteenWhenGivenARangeOfFifteen(){
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n" +
                     "11\nFizz\n13\n14\nFizzBuzz", fizzBuzz.numbers(1,15));
    }
}
