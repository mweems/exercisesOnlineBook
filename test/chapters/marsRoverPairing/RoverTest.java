package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void shouldMoveOneCoordinateAlongTheXAxis(){
        Rover rover = new Rover(0,0,"E");

        rover.move(1);

        assertEquals(1, rover.getXCoordinate());
    }

    @Test
    public void shouldMoveTwoCoordinatesAlongTheXAxis() {
        Rover rover = new Rover(2,0,"E");

        rover.move(2);

        assertEquals(4, rover.getXCoordinate());
    }

    @Test
    public void shouldMoveOneCoordinateAlongTheYAxis(){
        Rover rover = new Rover(0,0,"N");

        rover.move(1);

        assertEquals(1, rover.getYCoordinate());

    }
}
