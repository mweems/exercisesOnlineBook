package chapters.marsRoverPairing;

public class North extends Position {

    public North(int xCoordinate, int yCoordinate) {
        super(NORTH);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    @Override
    public Position move() {
       return new North(xCoordinate, yCoordinate + 1);
    }

    @Override
    public Position turnLeft() {
        return new West(xCoordinate, yCoordinate);
    }

    @Override
    public Position turnRight() {
        return new East(xCoordinate, yCoordinate);
    }
}
