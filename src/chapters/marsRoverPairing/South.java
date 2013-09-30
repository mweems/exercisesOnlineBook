package chapters.marsRoverPairing;

public class South extends Position {

    public South(int xCoordinate, int yCoordinate) {
        super(SOUTH);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    @Override
    public Position move() {
       return new South(xCoordinate, yCoordinate - 1);
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
