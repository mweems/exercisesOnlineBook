package chapters.marsRoverPairing;

public class South extends Position {

    public South() {
        super(SOUTH);
    }

    @Override
    public Position turnLeft() {
        return new East();
    }
}
