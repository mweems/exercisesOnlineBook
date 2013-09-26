package chapters.basicExercises;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VectorTest {

    Vector vector = new Vector();

    @Test
    public void shouldReturnADoubleWhenPassedAnIntForBothXAndYCoordinates(){
        double[] expected = {1.0, 2.0};
        assertTrue(Arrays.equals(expected, vector.getCoordinates(1, 2)));
    }

    @Test
    public void shouldReturnSumOfCoordinatesPassedInAsDouble(){
        double[] expected = {4.0, 6.0};
        assertTrue(Arrays.equals(expected, vector.sumCoordinates(1,2,3,4)));
    }

    @Test
    public void shouldReturnDifferenceOfCoordinatesPassedInAsDouble(){
        double[] expected = {1.0, 3.0};
        assertTrue(Arrays.equals(expected, vector.diffCoordinates(3,4,2,1)));
    }

    @Test
    public void shouldReturnDotProductOfTwoEqualLengthArraysOfIntegers(){
        int[] firstSet = {1,3,-5};
        int[] secondSet = {4,-2,-1};
        assertEquals(3, vector.dotProduct(firstSet, secondSet));
    }

    @Test
    public void shouldReturnVectorLengthWhenGivenTheLengthOfTwoSides(){
        assertEquals(2, vector.vectorLength(2,2));
    }
}
