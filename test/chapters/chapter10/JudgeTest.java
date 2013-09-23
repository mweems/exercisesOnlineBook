package chapters.chapter10;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JudgeTest {

    @Test
    public void shouldReturnAScoreBetweenOneAndTen(){
        Judge judge = new Judge();

        for(int i = 0; i <= 100; i++) assertTrue(judge.score() >= 0 && judge.score() <= 10);
    }
}
