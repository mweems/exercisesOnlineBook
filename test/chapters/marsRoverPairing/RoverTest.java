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
