package chapters.chapter10;

import java.util.Random;

public class Judge {

    final Random rand = new Random();

    public int score() {
        return rand.nextInt(11);
    }
}
