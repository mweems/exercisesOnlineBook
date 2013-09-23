package chapters.chapter10;

public class FakeJudge extends Judge {


    private final double score;

    public FakeJudge(double score) {
        this.score = score;
    }

    @Override
    public Double score() {
        return score;
    }
}
