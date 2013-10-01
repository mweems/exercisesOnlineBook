package chapters.marsRoverPairing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateTest {

    @Test
    public void shouldReturnSameCoordinatesAsPassedIn(){
        Coordinate coordinates = new Coordinate(1,2);
        assertEquals(1, coordinates.x);
        assertEquals(2, coordinates.y);
    }
}
