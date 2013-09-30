package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NewPositionTest {

    @Test
    public void shouldReturnWestWhenFacingNorthAndTurnLeft(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.N);
        position.turnLeft();
        assertEquals("W", position.getDirection());
    }

    @Test
    public void shouldReturnSouthWhenFacingWestAndTurnLeft(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.W);
        position.turnLeft();
        assertEquals("S", position.getDirection());
    }

    @Test
    public void shouldReturnEastWhenFacingSouthAndTurnLeft(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.S);
        position.turnLeft();
        assertEquals("E", position.getDirection());
    }

    @Test
    public void shouldReturnNorthWhenFacingEastAndTurnLeft(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.E);
        position.turnLeft();
        assertEquals("N", position.getDirection());
    }

    @Test
    public void shouldReturnEastWhenFacingNorthAndTurnRight(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.N);
        position.turnRight();
        assertEquals("E", position.getDirection());
    }

    @Test
    public void shouldReturnNorthWhenFacingWestAndTurnRight(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.W);
        position.turnRight();
        assertEquals("N", position.getDirection());
    }

    @Test
    public void shouldReturnWestWhenFacingSouthAndTurnRight(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.S);
        position.turnRight();
        assertEquals("W", position.getDirection());
    }

    @Test
    public void shouldReturnSouthWhenFacingEastAndTurnRight(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.E);
        position.turnRight();
        assertEquals("S", position.getDirection());
    }

    @Test
    public void shouldAddOneToTheXCoordinateWhenFacingEastAndMove(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.E);
        position.move();
        assertEquals(1, position.getXCoordinate());
    }

    @Test
    public void shouldSubtractOneFromTheXCoordinateWhenFacingWestAndMove(){
        NewPosition position = new NewPosition(1,0, NewPosition.Directions.W);
        position.move();
        assertEquals(0, position.getXCoordinate());
    }

    @Test
    public void shouldAddOneToTheYCoordinateWhenFacingNorthAndMove(){
        NewPosition position = new NewPosition(0,0, NewPosition.Directions.N);
        position.move();
        assertEquals(1, position.getYCoordinate());
    }

    @Test
    public void shouldSubtractOneFromTheYCoordinateWhenFacingSouthAndMove(){
        NewPosition position = new NewPosition(0,1, NewPosition.Directions.S);
        position.move();
        assertEquals(0, position.getYCoordinate());
    }

    @Test
    public void shouldReturnTrueWhenAllFieldsInTwoObjectsAreTheSame(){
        North positionOne = (North) Position.createPosition(0,0,"N");
        North positionTwo = (North) Position.createPosition(0,0,"N");
        assertTrue(positionOne.equals(positionTwo));
    }

    @Test
    public void shouldReturnFalseWhenAllFieldsInTwoObjectsAreNotTheSame(){
        North positionOne = (North) Position.createPosition(0,0,"N");
        North positionTwo = (North) Position.createPosition(1,0,"N");
        assertFalse(positionOne.equals(positionTwo));
    }

    @Test
    public void equalsShouldReturnFalseWhenObjectIsOfDifferentType(){
        North positionOne = (North) Position.createPosition(0,0,"N");
        Grid grid = new Grid(0, 0);
        assertFalse(positionOne.equals(grid));
    }

    @Test
    public void equalsShouldReturnFalseWhenObjectIsNull(){
        North position = (North) Position.createPosition(0,0,"N");
        assertFalse(position.equals(null));
    }

    @Test
    public void hashCodeShouldReturnTheSameNumberForTwoEqualObjects(){
        North positionOne = (North) Position.createPosition(0,0,"N");
        North positionTwo = (North) Position.createPosition(0,0,"N");
        assertEquals(positionOne.hashCode(), positionTwo.hashCode());
    }

}
