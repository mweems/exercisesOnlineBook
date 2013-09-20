package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardinalDirectionTest {

    @Test
    public void shouldReturnWestWhenFacingNorthAndTurnLeft(){
        CardinalDirection position = new CardinalDirection("N");

        CardinalDirection newDirection = position.turnLeft();

        assertEquals(West.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnSouthWhenFacingWestAndTurnLeft(){
        CardinalDirection position = new CardinalDirection("W");

        CardinalDirection newDirection = position.turnLeft();

        assertEquals(South.class, newDirection.getClass());
    }

    @Test
    public void shouldReturnNorthWhenFacingEastAndTurnLeft(){
        CardinalDirection position = new CardinalDirection("E");

        CardinalDirection newDirection = position.turnLeft();

        assertEquals(North.class, newDirection.getClass());
    }




}
