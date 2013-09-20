package chapters.marsRoverPairing;

public class West extends Position {

    public West() {
        super(WEST);
    }

    @Override
    public Position turnLeft() {
        return new South();
    }
}
