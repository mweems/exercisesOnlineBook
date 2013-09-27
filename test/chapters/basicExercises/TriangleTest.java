package chapters.basicExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    public void shouldReturnOneAsteriskWhenGivenAOne(){
        assertEquals("*", triangle.oneLine(1));
    }

    @Test
    public void shouldReturnFiveAsterisksWhenGivenAFive(){
        assertEquals("*****", triangle.oneLine(5));
    }

    @Test
    public void shouldReturnFiveAsterisksOnFiveLinesWhenGivenAFive(){
        assertEquals("*\n*\n*\n*\n*", triangle.multiLine(5));
    }

    @Test
    public void shouldReturnLineWithTheSameNumberOfAsterisksAsTheLineNumber(){
        assertEquals("*\n**\n***\n****", triangle.additiveMultiLine(4));
    }
}
