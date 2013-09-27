package chapters.basicExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersTest {

    Numbers number = new Numbers();

    @Test
    public void shouldReturnOneWhenGivenAOne(){
        assertEquals(1, number.addNum(1));
    }

    @Test
    public void shouldReturnThreeWhenGivenATwo(){
        assertEquals(3, number.addNum(2));
    }

    @Test
    public void shouldReturnOneHundredTwentyWhenGivenAFive(){
        assertEquals(120, number.factorial(5));
    }

    @Test
    public void shouldReturnTwoWhenGivenAThree(){
        assertEquals(2, number.avg(3));
    }
}
