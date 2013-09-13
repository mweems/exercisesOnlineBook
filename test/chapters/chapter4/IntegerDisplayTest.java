package chapters.chapter4;

import chapters.Chapter4.IntegerDisplay;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class IntegerDisplayTest {

    @Test
    public void displayNumberUnder100DivisibleBy6Or7(){
       IntegerDisplay display = new IntegerDisplay();
        assertEquals("display shown", display.divisible());
    }

    @Test
    public void displayNumberUnder100DivisibleBy6Or7ButNotBoth(){
       IntegerDisplay display = new IntegerDisplay();
        assertEquals("display shown", display.unlessDivisible());
    }
}
