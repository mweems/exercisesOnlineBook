package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void shouldMoveOneCoordinateAlongTheXAxis(){
        Rover rover = new Rover(0,0,"E");

        rover.move();

        assertEquals(1, rover.getXCoordinate());
    }

    @Test
    public void shouldMoveTwoCoordinatesAlongTheXAxis() {
        Rover rover = new Rover(2,0,"E");

        rover.move();
        rover.move();

        assertEquals(4, rover.getXCoordinate());
    }

    @Test
    public void shouldMoveOneCoordinateAlongTheYAxis(){
        Rover rover = new Rover(0,0,"N");

        rover.move();

        assertEquals(1, rover.getYCoordinate());

    }

    @Test
    public void shouldEndFacingSouthWhenWestAndTurnLeft(){
        Rover rover = new Rover(0,0,"W");

        rover.turnLeft();

        assertEquals("S", rover.getDirection());
    }

    @Test
    public void shouldEndFacingNorthWhenEastAndTurnLeft() {
        Rover rover = new Rover(0, 0, "E");

        rover.turnLeft();

        assertEquals("N", rover.getDirection());
    }

    @Test
    public void shouldEndFacingWestWhenNorthAndTurnLeft() {
        Rover rover = new Rover(0,0,"N");

        rover.turnLeft();

        assertEquals("W", rover.getDirection());
    }

    @Test
    public void shouldEndFacingEastWhenFacingSouthAndTurnLeft() {
        Rover rover = new Rover(0,0,"S");

        rover.turnLeft();

        assertEquals("E", rover.getDirection());
    }
}
