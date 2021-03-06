package chapters.basicExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondTest {

    @Test
    public void shouldReturnATriangleWithThreeLines(){
        assertEquals("  *\n ***\n*****", Diamond.makeTriangle(3));
    }

    @Test
    public void shouldReturnATriangleWithFiveLines(){
        assertEquals("    *\n" +
                     "   ***\n" +
                     "  *****\n" +
                     " *******\n" +
                     "*********", Diamond.makeTriangle(5));
    }

    @Test
    public void shouldReturnADiamondWithThreeLines(){
        assertEquals(" *\n***\n *", Diamond.makeDiamond(3));
    }

    @Test
    public void shouldReturnADiamondWithFiveLines(){
        assertEquals("  *\n" +
                     " ***\n" +
                     "*****\n" +
                     " ***\n" +
                     "  *", Diamond.makeDiamond(5));
    }

    @Test
    public void shouldReturnDiamondWithThreeLinesAndMattAsMiddleLine(){
        assertEquals(" *\nMatt\n *", Diamond.nameDiamond(3,"Matt"));
    }
}
