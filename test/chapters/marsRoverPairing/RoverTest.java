package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {

    @Test
    public void shouldMoveOneCoordinateAlongTheXAxis() throws Exception {
        NewPosition startPosition = new NewPosition(0,0, NewPosition.Directions.E);
        Rover rover = new Rover(startPosition, new Grid(1, 1));
        rover.move();
        assertEquals(1, rover.getPosition().getXCoordinate());
    }

    @Test
    public void shouldMoveTwoCoordinatesAlongTheXAxis() throws Exception {
       NewPosition startPosition = new NewPosition(2,0, NewPosition.Directions.E);
        Rover rover = new Rover(startPosition, new Grid(5, 5));
        rover.move();
        rover.move();
        assertEquals(4, rover.getPosition().getXCoordinate());
    }

    @Test
    public void shouldMoveOneCoordinateAlongTheYAxis() throws Exception {
        NewPosition startPosition = new NewPosition (0,0, NewPosition.Directions.N);
        Rover rover = new Rover(startPosition, new Grid(1, 1));
        rover.move();
        assertEquals(1, rover.getPosition().getYCoordinate());

    }

    @Test
    public void shouldSubtractOneFromYCoordinateWhenFacingSouthAndMove() throws Exception {
        NewPosition startPosition = new NewPosition(0,1, NewPosition.Directions.S);
        Rover rover = new Rover(startPosition, new Grid(1, 1));
        rover.move();
        assertEquals(0, rover.getPosition().getYCoordinate());
    }

    @Test
    public void shouldSubtractOneFromXCoordinateWhenFacingWestAndMove() throws Exception {
        NewPosition startPosition = new NewPosition(1,0, NewPosition.Directions.W);
        Rover rover = new Rover(startPosition, new Grid(1, 1));
        rover.move();
        assertEquals(0, rover.getPosition().getXCoordinate());
    }

    @Test
    public void shouldEndFacingWestWhenFacingNorthAndTurnLeft() throws Exception {
        NewPosition north = new NewPosition(0,0, NewPosition.Directions.N);
        Rover rover = new Rover(north, new Grid(1, 1));
        rover.turnLeft();
        assertEquals("W", rover.getPosition().getDirection());
    }

    @Test
    public void shouldEndFacingEastWhenFacingNorthAndTurnRight() throws Exception {
        NewPosition north = new NewPosition(0,0, NewPosition.Directions.N);
        Rover rover = new Rover(north, new Grid(1, 1));
        rover.turnRight();
        assertEquals("E", rover.getPosition().getDirection());
    }

    @Test
    public void shouldCreateABeaconWhenOnTheEdgeAndGoingOver() throws Exception {
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.N);
        NewPosition endPosition = new NewPosition (0,1, NewPosition.Directions.N);
        Grid grid = new Grid(1, 1);
        Rover rover = new Rover(position, grid);
        rover.move();
        rover.move();
        assertEquals(true, grid.hasBeaconAt(endPosition));
    }

    @Test
    public void shouldReturnLastValidPositionWhenGoesOffEdgeAndSetsRoverToDead() throws Exception {
        NewPosition positionOne =  new NewPosition(0,0, NewPosition.Directions.N);
        Grid grid = new Grid(1,1);
        Rover rover = new Rover(positionOne, grid);
        rover.move();
        rover.move();
        assertEquals(1, rover.getPosition().getYCoordinate());
        assertTrue(rover.isDead());
    }

    @Test
    public void shouldReturnNotDeadWhenStillOnGrid(){
        Rover rover = new Rover(new NewPosition(0,0, NewPosition.Directions.N), new Grid(1,1));
        assertFalse(rover.isDead());
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenAskedToMoveWhenDead() throws Exception {
        NewPosition positionOne = new NewPosition(0,0, NewPosition.Directions.N);
        Grid grid = new Grid(1,1);
        Rover rover = new Rover(positionOne, grid);
        rover.move();
        rover.move();
        rover.move();
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenAskedToTurnLeftWhenDead() throws Exception {
        NewPosition positionOne =  new NewPosition(0,0, NewPosition.Directions.N);
        Grid grid = new Grid(1,1);
        Rover rover = new Rover(positionOne, grid);
        rover.move();
        rover.move();
        rover.turnLeft();
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenAskedToTurnRightWhenDead() throws Exception {
        NewPosition positionOne =  new NewPosition(0,0, NewPosition.Directions.N);
        Grid grid = new Grid(1,1);
        Rover rover = new Rover(positionOne, grid);
        rover.move();
        rover.move();
        rover.turnRight();
    }

    @Test
    public void shouldNotRunOffGridWhenBeaconIsPresent() throws Exception {
        Grid grid = new Grid(0,0);
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.N);
        grid.addBeacon(position);
        Rover rover = new Rover(position,grid);
        rover.move();
        assertFalse(rover.isDead());
    }

    @Test
    public void shouldIgnoreBeaconIfNotFacingSameDirection() throws Exception {
        Grid grid = new Grid(0,0);
        grid.addBeacon(new NewPosition(0,0, NewPosition.Directions.N));
        Rover rover = new Rover(new NewPosition(0,0, NewPosition.Directions.S), grid);
        rover.move();
        assertTrue(rover.isDead());
    }

    @Test
    public void shouldHandleMultipleBeaconsOnAPosition() throws Exception {
        Grid grid = new Grid(0,0);
        NewPosition position1 = new NewPosition(0,0, NewPosition.Directions.N);

        Rover rover1 = new Rover(position1,grid);
        rover1.move();
        assertTrue(rover1.isDead());

        NewPosition position2 = new NewPosition(0,0, NewPosition.Directions.W);
        Rover rover2 = new Rover(position2,grid);
        rover2.move();
        assertTrue(rover2.isDead());

        Rover rover3 = new Rover(position1,grid);
        rover3.move();
        assertFalse(rover3.isDead());
    }
}
