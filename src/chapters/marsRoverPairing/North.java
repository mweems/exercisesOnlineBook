package chapters.marsRoverPairing;

public class North extends Position {

    public North() {
        super(NORTH);
    }

    @Override
    public Position turnLeft() {
        return new West();
    }
}
