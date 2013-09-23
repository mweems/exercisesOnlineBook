package chapters.marsRoverPairing;

public class Rover {
    private Position position;

    public Rover(int xCoordinate, int yCoordinate, String direction) {
        this.position = Position.createPosition(xCoordinate, yCoordinate, direction);
    }

    public void move() {
        position.move();
    }

    public int getYCoordinate() {
        return position.getYCoordinate();
    }

    public int getXCoordinate() {
        return position.getXCoordinate();
    }


    public void turnLeft() {
        position = position.turnLeft();
    }

    public void turnRight() {
        position = position.turnRight();
    }

}
