package chapters.chapter10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ScoreTest {

    @Test
    public void testScoreReturnsADoubleBetweenOneAndTen(){
        Score score = new Score();
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertTrue(scores.contains(score.getScore()));

    }
}
