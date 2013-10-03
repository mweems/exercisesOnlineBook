package chapters.gameOfLife;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void shouldReturnArrayWithOneCellObject() throws Exception {
        Grid grid = new Grid("X", "X", "O");
        ArrayList<ArrayList<Cell>> cells = grid.tick();
        Cell cell = new Cell(true);
        assertEquals(cell.getClass(), cells.get(0).get(0).getClass());
    }

    @Test
    public void shouldReturnArrayWithTwoArraysWithOnceCellInEachArray() throws Exception {
        Grid grid = new Grid("X\nX", "X", "O");
        ArrayList<ArrayList<Cell>> cells = grid.tick();
        assertEquals(2, cells.size());
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionIfInnerArraysAreDifferentLengths() throws Exception {
        String gridCells = "XXX\nXX";
        new Grid(gridCells,"X", "O");
    }
}
