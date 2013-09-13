package chapters.chapter6;

import java.util.Random;

public class CoinFlip {
    private final Random rand;

    public CoinFlip(Random rand) {
        this.rand = rand;
    }

    public Coin flipCoin() {
        boolean value = rand.nextBoolean();
        Coin coin = new Coin(value);
        return coin;
    }

    public String flipGame(int gameLength) {
        int counter = 0;
        int totalFlips = 0;
        while(counter < gameLength){
            Coin coin = flipCoin();
            if(coin.getValue() == "Heads") counter++;
            if(coin.getValue() == "Tails") counter = 0;
            totalFlips++;
            System.out.println(coin.getValue());
        }
        return "It took " + totalFlips + " flips to get " + gameLength + " consecutive Heads";
    }
}
