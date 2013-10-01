package chapters.gameOfLife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void shouldReturnAliveWhenPassedInTrue(){
        Cell cell = new Cell(true);
        assertTrue(cell.isAlive());
    }

    @Test
    public void shouldReturnDeadWhenPassedInFalse(){
        Cell cell = new Cell(false);
        assertFalse(cell.isAlive());
    }

    @Test
    public void shouldReturnDeadWhenAliveAndDieIsCalled(){
        Cell cell = new Cell(true);
        cell.die();
        assertFalse(cell.isAlive());
    }

    @Test
    public void shouldReturnAliveWhenDeadAndLiveIsCalled(){
        Cell cell = new Cell(false);
        cell.live();
        assertTrue(cell.isAlive());
    }
}
