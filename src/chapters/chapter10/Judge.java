package chapters.chapter10;

import java.util.Random;

public class Judge {

    final Random rand = new Random();

    public Double score() {
        int firstInt = rand.nextInt(11);
        int secondInt = rand.nextInt(100);
        Double scorePercent = (double) secondInt / 100;
        return firstInt + scorePercent;
    }
}
