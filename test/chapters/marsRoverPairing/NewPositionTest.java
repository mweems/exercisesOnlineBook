package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NewPositionTest {

    @Test
    public void shouldReturnWestWhenFacingNorthAndTurnLeft(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.NORTH);
        position.turnLeft();
        assertEquals("WEST", position.getDirection());
    }

    @Test
    public void shouldReturnSouthWhenFacingWestAndTurnLeft(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.WEST);
        position.turnLeft();
        assertEquals("SOUTH", position.getDirection());
    }

    @Test
    public void shouldReturnEastWhenFacingSouthAndTurnLeft(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.SOUTH);
        position.turnLeft();
        assertEquals("EAST", position.getDirection());
    }

    @Test
    public void shouldReturnNorthWhenFacingEastAndTurnLeft(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.EAST);
        position.turnLeft();
        assertEquals("NORTH", position.getDirection());
    }

    @Test
    public void shouldReturnEastWhenFacingNorthAndTurnRight(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.NORTH);
        position.turnRight();
        assertEquals("EAST", position.getDirection());
    }

    @Test
    public void shouldReturnNorthWhenFacingWestAndTurnRight(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.WEST);
        position.turnRight();
        assertEquals("NORTH", position.getDirection());
    }

    @Test
    public void shouldReturnWestWhenFacingSouthAndTurnRight(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.SOUTH);
        position.turnRight();
        assertEquals("WEST", position.getDirection());
    }

    @Test
    public void shouldReturnSouthWhenFacingEastAndTurnRight(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.EAST);
        position.turnRight();
        assertEquals("SOUTH", position.getDirection());
    }

    @Test
    public void shouldAddOneToTheXCoordinateWhenFacingEastAndMove(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.EAST);
        position.move();
        assertEquals(1, position.getXCoordinate());
    }

    @Test
    public void shouldSubtractOneFromTheXCoordinateWhenFacingWestAndMove(){
        NewPosition position = new NewPosition(1,0, NewPosition.Directions.WEST);
        position.move();
        assertEquals(0, position.getXCoordinate());
    }

    @Test
    public void shouldAddOneToTheYCoordinateWhenFacingNorthAndMove(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.NORTH);
        position.move();
        assertEquals(1, position.getYCoordinate());
    }

    @Test
    public void shouldSubtractOneFromTheYCoordinateWhenFacingSouthAndMove(){
        NewPosition position = new NewPosition(0,1, NewPosition.Directions.SOUTH);
        position.move();
        assertEquals(0, position.getYCoordinate());
    }

    @Test
    public void shouldReturnTrueWhenAllFieldsInTwoObjectsAreTheSame(){
        NewPosition positionOne = new NewPosition(0,0, NewPosition.Directions.NORTH);
        NewPosition positionTwo = new NewPosition(0,0, NewPosition.Directions.NORTH);
        assertTrue(positionOne.equals(positionTwo));
    }

    @Test
    public void shouldReturnFalseWhenAllFieldsInTwoObjectsAreNotTheSame(){
        NewPosition positionOne = new NewPosition(0,0, NewPosition.Directions.NORTH);
        NewPosition positionTwo = new NewPosition (1,0, NewPosition.Directions.NORTH);
        assertFalse(positionOne.equals(positionTwo));
    }

    @Test
    public void equalsShouldReturnFalseWhenObjectIsOfDifferentType(){
        NewPosition positionOne = new NewPosition(0,0, NewPosition.Directions.NORTH);
        Grid grid = new Grid(0, 0);
        assertFalse(positionOne.equals(grid));
    }

    @Test
    public void equalsShouldReturnFalseWhenObjectIsNull(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.NORTH);
        assertFalse(position.equals(null));
    }

    @Test
    public void hashCodeShouldReturnTheSameNumberForTwoEqualObjects(){
        NewPosition positionOne = new NewPosition(0,0, NewPosition.Directions.NORTH);
        NewPosition positionTwo = new NewPosition(0,0, NewPosition.Directions.NORTH);
        assertEquals(positionOne.hashCode(), positionTwo.hashCode());
    }

}
