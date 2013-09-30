package chapters.marsRoverPairing;

public class West extends Position {

    public West(int xCoordinate, int yCoordinate) {
        super(WEST);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    @Override
    public Position move() {
       return new West(xCoordinate - 1, yCoordinate);
    }

    @Override
    public Position turnLeft() {
        return new South(xCoordinate, yCoordinate);
    }

    @Override
    public Position turnRight() {
        return new North(xCoordinate, yCoordinate);
    }
}
