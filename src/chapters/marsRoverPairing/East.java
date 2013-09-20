package chapters.marsRoverPairing;

public class East extends Position {

    public East() {
        super(EAST);
    }

    @Override
    public Position turnLeft() {
        return new North();
    }
}
