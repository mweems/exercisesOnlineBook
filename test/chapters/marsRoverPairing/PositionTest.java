package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void shouldReturnWestWhenFacingNorthAndTurnLeft(){
        North position = (North) Position.createPosition("N");

        Position newDirection = position.turnLeft();

        assertEquals(West.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnSouthWhenFacingWestAndTurnLeft(){
        West position = (West) Position.createPosition("W");

        Position newDirection = position.turnLeft();

        assertEquals(South.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnNorthWhenFacingEastAndTurnLeft(){
        East position = (East) Position.createPosition("E");

        Position newDirection = position.turnLeft();

        assertEquals(North.class, newDirection.getClass());
    }

    @Test
    public void shouldCreateASouthObjectWhenPassingS() {
        South position = (South) Position.createPosition("S");

        assertEquals(South.class, position.getClass());
    }

    @Test
    public void shouldCreateAnEastObjectWhenPassingE(){
        East position = (East) Position.createPosition("E");

        assertEquals(East.class, position.getClass());
    }




}
