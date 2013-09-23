package chapters.marsRoverPairing;

public class North extends Position {

    public North(int xCoordinate, int yCoordinate) {
        super(NORTH);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    @Override
    public void move() {
        yCoordinate++;
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
