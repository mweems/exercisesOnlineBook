package chapters.marsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    Rover rover = new Rover();

    @Test
    public void testRoverReturnsCorrectCoordinateForXMovement(){
        assertEquals("0 1 N",rover.move("0 0 N", "M"));
    }

    @Test
    public void testRoverReturnsCorrectDirectionForTurns(){
        assertEquals("0 0 E",rover.move("0 0 N", "R"));
        assertEquals("0 0 W",rover.move("0 0 N", "L"));
    }

    @Test
    public void testRoverIgnoresNonValidInput(){
        assertEquals("0 0 S", rover.move("0 0 N", "RBR"));
    }
}
