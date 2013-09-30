package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {


    @Test
    public void shouldPrintOriginalPositionAsFinalPositionWhenNotGivenMovementInstructions() {
        MarsRover marsRover = new MarsRover(1, 2, "N");
        assertEquals("1,2,N", marsRover.getFinalPosition());

    }

    @Test
    public void shouldPrintActualFinalPositionWhenToldToMove(){
        MarsRover marsRover = new MarsRover(0,0,"N");
        marsRover.move("M");
        assertEquals("0,1,N", marsRover.getFinalPosition());

    }


}
