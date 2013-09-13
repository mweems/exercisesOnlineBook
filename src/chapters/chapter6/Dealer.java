package chapters.chapter6;

import java.util.Random;

public class Dealer {
    private final Random rand;
    private final String[] cardValue = new String[] {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    private final String[] cardSuit = new String[] {"Hearts","Clubs","Spades","Diamonds"};

    public Dealer(Random rand) {
        this.rand = rand;
    }

    public Card dealCard() {
        int value = rand.nextInt(13);
        int suit = rand.nextInt(4);
        Card card = new Card(cardSuit[suit],cardValue[value]);
        return card;
    }
}
