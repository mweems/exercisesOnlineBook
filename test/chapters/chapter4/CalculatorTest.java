package chapters.chapter4;

import chapters.Chapter4.Calculator;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

     Calculator calc = new Calculator();


    @Test
    public void shouldReturnFirstOddNumber(){
        assertEquals(1, calc.add(1));
    }

    @Test
    public void shouldAdd1And3(){
        assertEquals(4, calc.add(2));
    }

    @Test
    public void shouldAdd135And7(){
        assertEquals(16, calc.add(4));
    }
}
