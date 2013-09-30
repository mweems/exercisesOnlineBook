package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GridTest {

    @Test
    public void shouldReturnTrueIfThereIsABeaconAtGivenPosition(){
        NewPosition position = new NewPosition(1,0, NewPosition.Directions.N);
        Grid grid = new Grid(1,1);
        grid.addBeacon(position);
        assertEquals(true, grid.hasBeaconAt(position));
    }

    @Test
    public void shouldReturnFalseIfThereIsNoBeaconAtAGivenPosition(){
        NewPosition position = new NewPosition(1,0, NewPosition.Directions.N);
        Grid grid = new Grid(1,1);
        assertEquals(false, grid.hasBeaconAt(position));
    }

    @Test
    public void shouldReturnFalseIfPassedInANullPosition(){
        Grid grid = new Grid(1,1);
        assertEquals(false, grid.hasBeaconAt(null));
    }

    @Test
    public void shouldReturnTrueWhenPassedAPositionWithinBounds(){
        Coordinate coordinate = new Coordinate(1,1);
        Grid grid = new Grid(2,2);
        assertTrue(grid.isValidPosition(coordinate));
    }

    @Test
    public void shouldReturnFalseWhenPassedAPositionOutsideOfBounds(){
        Coordinate coordinate = new Coordinate(2,1);
        Grid grid = new Grid(1,1);
        assertFalse(grid.isValidPosition(coordinate));
    }

    @Test
    public void shouldMaintainMultipleBeacons(){
        Grid grid = new Grid(0,0);
        NewPosition positionOne = new NewPosition(0,0, NewPosition.Directions.N);
        NewPosition positionTwo = new NewPosition(0,0, NewPosition.Directions.W);
        grid.addBeacon(positionOne);
        grid.addBeacon(positionTwo);
        assertTrue(grid.hasBeaconAt(positionOne));
        assertTrue(grid.hasBeaconAt(positionTwo));

    }
}
