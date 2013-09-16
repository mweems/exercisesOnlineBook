package chapters.chapter9;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ScrabbleScoreTest {

    @Test
    public void whenPassedTheLetterAShouldReturn1(){
        ScrabbleScore game = new ScrabbleScore();
        assertEquals(1, game.scoreWord("A"));
    }

    @Test
    public void whenPassedTheWordFarmShouldReturn9(){
        ScrabbleScore game = new ScrabbleScore();
        assertEquals(9, game.scoreWord("FARM"));
    }
}
