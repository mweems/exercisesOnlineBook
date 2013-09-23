package chapters.chapter10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    @Test
    public void shouldReturnScoreWhenGivenOneJudge(){
        FakeJudge judge = new FakeJudge(5);
        Game game = new Game(judge);
        assertEquals(5, game.score());
    }

    @Test
    public void shouldReturnAvgScoreWhenGivenTwoJudges(){
        FakeJudge judgeOne = new FakeJudge(7);
        FakeJudge judgeTwo = new FakeJudge(3);
        Game game = new Game(judgeOne,judgeTwo);
        assertEquals(5, game.score());
    }

    @Test
    public void shouldDropHighestAndLowestScoreWhenGivenFiveOrMoreJudgesAndGetAverageOfTheRest(){
        FakeJudge judgeOne = new FakeJudge(7);
        FakeJudge judgeTwo = new FakeJudge(5);
        FakeJudge judgeThree = new FakeJudge(5);
        FakeJudge judgeFour = new FakeJudge(5);
        FakeJudge judgeFive = new FakeJudge(1);
        Game game = new Game(judgeFive,judgeFour,judgeOne,judgeThree,judgeTwo);
        assertEquals(5, game.score());

    }
}
