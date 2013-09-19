package chapters.marsRover;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class MarsRoverTest {

    MarsRover marsRover = new MarsRover("/Users/Thoughtworker/Desktop/projects/continued_learning/study/java/onlineBook/src/chapters/marsRover/instructions");

    Rover[] rovers = marsRover.createRovers();
    Rover roverOne = rovers[0];
    Rover roverTwo = rovers[1];

    @Test
    public void testRoverMainCreatesNewGrid(){
        Grid grid = marsRover.createGrid();
        assertNotNull(grid);
    }

    @Test
    public void testRoverMainCreatesTwoRovers(){
        assertNotNull(roverOne);
        assertNotNull(roverTwo);
    }

    @Test
    public void testRoverMainSetsGridSize(){
        int[] expected = {5,5};
        int[] actual = marsRover.setGridSize();
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testRoverMainReturnsEndLocationForEachRover(){
        assertEquals("13N\n51E", marsRover.finalCoordinates());
    }
}
