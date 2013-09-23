package chapters.marsRoverPairing;

public class South extends Position {

    public South(int xCoordinate, int yCoordinate) {
        super(SOUTH);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    @Override
    public void move() {
        yCoordinate--;
    }

    @Override
    public Position turnLeft() {
        return new East(xCoordinate, yCoordinate);
    }

    @Override
    public Position turnRight() {
        return new West(xCoordinate, yCoordinate);
    }
}
