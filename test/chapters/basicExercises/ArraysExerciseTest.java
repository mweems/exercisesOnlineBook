package chapters.basicExercises;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArraysExerciseTest {

    ArraysExercise array = new ArraysExercise();

    @Test
    public void shouldReturnTheShortestStringFromAnArrayOfStrings(){
        String[] words = {"green", "leafy", "bag", "hungry"};
        assertEquals("bag", array.findShortestString(words));
    }

    @Test
    public void shouldReturnAllOddIntegersFromAnIntegerArray(){
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        Integer[] expected = {1,3,5,7,9};
        assertTrue(Arrays.equals(expected, array.findOddNumbers(numbers)));
    }

    @Test
    public void shouldReturnTheSumOfOddIntegersAndTheProductOfEvenIntegers(){
        int[] numbers = {1,2,3,4};
        int[] expected = {4,8};
        assertTrue(Arrays.equals(expected, array.sumProduct(numbers)));
    }
}
