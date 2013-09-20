package chapters.marsRover;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class MarsRoverTest {

    MarsRover marsRover = new MarsRover("/Users/Thoughtworker/Desktop/projects/continued_learning/study/java/onlineBook/src/chapters/marsRover/instructions");
//      MarsRover marsRover = new MarsRover("instructions.txt");
    Grid grid = marsRover.createGrid();
    ArrayList<Rover> rover = marsRover.createRovers();

    @Test
    public void testRoverMainSetsGridSize(){
        int[] expected = {5,5};
        int[] actual = marsRover.gridSize();
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void testRoverMainReturnsEndLocationForEachRover(){
        assertEquals("1 3 N\n5 1 E", marsRover.finalCoordinates());
    }

//    @Test
//    public void testRoverWillMakeMoreThanTwoRoversAndReturnCorrectCoordinates(){
//        MarsRover thisRover = new MarsRover("5 5\n" +
//                                            "1 2 N\n" +
//                                            "LMLMLMLMM\n" +
//                                            "3 3 E\n" +
//                                            "MMRMMRMRRM\n" +
//                                            "1 2 N\n" +
//                                            "LMLMLMLMM");
//        assertEquals("1 3 N\n5 1 E\n1 3 N", thisRover.finalCoordinates());
//    }
}
