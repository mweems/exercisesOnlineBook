package chapters.chapter10;

public class FakeJudge extends Judge {


    private final int score;

    public FakeJudge(int score) {
        this.score = score;
    }

    @Override
    public int score() {
        return score;
    }
}
