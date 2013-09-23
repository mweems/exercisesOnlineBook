package chapters.marsRoverPairing;

public class East extends Position {

    public East(int xCoordinate, int yCoordinate) {
        super(EAST);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    @Override
    public void move() {
        xCoordinate++;
    }

    @Override
    public Position turnLeft() {
        return new North(xCoordinate, yCoordinate);
    }

    @Override
    public Position turnRight() {
        return new South(xCoordinate, yCoordinate);
    }
}
