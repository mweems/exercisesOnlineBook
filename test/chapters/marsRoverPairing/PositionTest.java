package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PositionTest {

    @Test
    public void shouldReturnWestWhenFacingNorthAndTurnLeft(){
        North position = (North) Position.createPosition(0,0,"N");

        Position newDirection = position.turnLeft();

        assertEquals(West.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnSouthWhenFacingWestAndTurnLeft(){
        West position = (West) Position.createPosition(0,0,"W");

        Position newDirection = position.turnLeft();

        assertEquals(South.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnNorthWhenFacingEastAndTurnLeft(){
        East position = (East) Position.createPosition(0,0,"E");

        Position newDirection = position.turnLeft();

        assertEquals(North.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnWestWhenFacingSouthAndTurnRight(){
        South position = (South) Position.createPosition(0,0,"S");

        Position newDirection = position.turnRight();

        assertEquals(West.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnNorthWhenFacingWestAndTurnRight(){
        West position = (West) Position.createPosition(0,0,"W");

        Position newDirection = position.turnRight();

        assertEquals(North.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnEastWhenFacingNorthAndTurnRight(){
        North position = (North) Position.createPosition(0,0,"N");

        Position newDirection = position.turnRight();

        assertEquals(East.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnSouthWhenFacingEastAndTurnRight(){
        East position = (East) Position.createPosition(0,0,"E");

        Position newDirection = position.turnRight();

        assertEquals(South.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnEastWhenFacingSouthAndTurnLeft(){
        South position = (South) Position.createPosition(0,0,"S");

        Position newDirection = position.turnLeft();

        assertEquals(East.class, newDirection.getClass());
    }

    @Test
    public void shouldCreateASouthObjectWhenPassingS() {
        South position = (South) Position.createPosition(0,0,"S");

        assertEquals(South.class, position.getClass());
    }

    @Test
    public void shouldCreateAnEastObjectWhenPassingE(){
        East position = (East) Position.createPosition(0,0,"E");

        assertEquals(East.class, position.getClass());
    }

    @Test
    public void shouldCreateAWestObjectWhenPassingW(){
        West position = (West) Position.createPosition(0,0,"W");

        assertEquals(West.class, position.getClass());
    }

    @Test
    public void shouldCreateANorthObjectWhenPassingN(){
        North position = (North) Position.createPosition(0,0,"N");

        assertEquals(North.class, position.getClass());
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
