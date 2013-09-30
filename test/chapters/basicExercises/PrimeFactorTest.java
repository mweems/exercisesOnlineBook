package chapters.basicExercises;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class PrimeFactorTest {

    @Test
    public void shouldReturnTwoThreeAndFiveWhenGivenThirty(){
        PrimeFactor factor = new PrimeFactor();
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
    }
}
