package chapters.marsRoverPairing;

public class West extends Position {

    public West(int xCoordinate, int yCoordinate) {
        super(WEST);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }


    @Override
    public void move() {
        xCoordinate--;
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
