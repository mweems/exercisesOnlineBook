package chapters.marsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    Rover rover = new Rover();

    @Test
    public void testRoverReturnsCorrectCoordinateForXMovement(){
        assertEquals("01N",rover.move("0 0 N", "M"));
    }

    @Test
    public void testRoverReturnsCorrectDirectionForTurns(){
        assertEquals("00E",rover.move("0 0 N", "R"));
        assertEquals("00W",rover.move("0 0 N", "L"));
    }
}
