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

        assertEquals("S", rover.getPosition());
    }

    @Test
    public void shouldEndFacingNorthWhenEastAndTurnLeft() {
        Rover rover = new Rover(0, 0, "E");

        rover.turnLeft();

        assertEquals("N", rover.getPosition());
    }

    @Test
    public void shouldEndFacingWestWhenNorthAndTurnLeft() {
        Rover rover = new Rover(0,0,"N");

        rover.turnLeft();

        assertEquals("W", rover.getPosition());
    }

    @Test
    public void shouldEndFacingEastWhenFacingSouthAndTurnLeft() {
        Rover rover = new Rover(0,0,"S");

        rover.turnLeft();

        assertEquals("E", rover.getPosition());
    }

    @Test
    public void shouldEndFacingWestWhenSouthAndTurnRight(){
        Rover rover = new Rover(0,0,"S");

        rover.turnRight();

        assertEquals("W", rover.getPosition());
    }

    @Test
    public void shouldEndFacingEastWhenNorthAndTurnRight(){
        Rover rover = new Rover(0,0,"N");

        rover.turnRight();

        assertEquals("E", rover.getPosition());
    }

    @Test
    public void shouldEndFacingSouthWhenFacingEastAndTurnRight(){
        Rover rover = new Rover(0,0,"E");

        rover.turnRight();

        assertEquals("S", rover.getPosition());
    }

    @Test
    public void shouldEndFacingNorthWhenFacingWestAndTurnRight(){
        Rover rover = new Rover(0,0,"W");

        rover.turnRight();

        assertEquals("N", rover.getPosition());
    }

    @Test
    public void shouldSubtractOneFromYCoordinateWhenFacingSouthAndMove(){
        Rover rover = new Rover(0,1,"S");

        rover.move();

        assertEquals(0, rover.getYCoordinate());
    }

    @Test
    public void shouldSubtractOneFromXCoordinateWhenFacingWestAndMove(){
        Rover rover = new Rover(1,0,"W");

        rover.move();

        assertEquals(0, rover.getXCoordinate());
    }

}
