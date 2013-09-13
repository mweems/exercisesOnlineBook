package chapters.chapter5;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PerfectSquareTest {

    PerfectSquare perfectSquare = new PerfectSquare();

    @Test
    public void returnTrueWhenPassedInANumberThatIsAPerfectSquare(){
        assertEquals(true, perfectSquare.isPerfectSquare(9));
    }

    @Test
    public void returnFalseWhenPassedInANumberThatIsNotAPerfectSquare(){
        assertEquals(false, perfectSquare.isPerfectSquare(8));
    }
}
