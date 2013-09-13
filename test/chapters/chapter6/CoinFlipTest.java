package chapters.chapter6;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CoinFlipTest {



    @Test
    public void returnsACoin(){
        Random rand = new Random(1);
        CoinFlip game = new CoinFlip(rand);
        Coin coin = game.flipCoin();
        assertNotNull(coin);
    }

    @Test
    public void coinValueIsHeads(){
        Random rand = new Random(1);
        CoinFlip game = new CoinFlip(rand);
        Coin coin = game.flipCoin();
        assertEquals("Heads", coin.getValue());
    }

    @Test
    public void gettingHeadsThreeTimesInARowResultsInGameOver(){
       Random rand = new Random(1);
       CoinFlip game = new CoinFlip(rand);
       assertEquals("It took 10 flips to get 3 consecutive Heads", game.flipGame(3));
    }
}
