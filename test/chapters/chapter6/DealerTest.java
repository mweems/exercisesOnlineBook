package chapters.chapter6;

import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class DealerTest {

    @Test
    public void returnsACard()
    {
       Random rand = new Random(100);
       Dealer dealer = new Dealer(rand);
       Card card = dealer.dealCard();
       assertNotNull(card);
       assertEquals("King", card.getValue());
       assertEquals("Spades", card.getSuit());
    }
}
