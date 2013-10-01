package chapters.marsRoverPairing;

public class MarsRover {

    private String finalPosition;

    public static void main(String[] args) {
        Rover rover = new Rover(new NewPosition(0, 0, NewPosition.Directions.NORTH), null);
        NewPosition position = rover.getNewPosition();

    }


    public MarsRover(int xCoordinate, int yCoordinate, String direction) {
    finalPosition = xCoordinate + "," + yCoordinate + "," + direction;

    }

    public String getFinalPosition() {
        return finalPosition;
    }

    public void move(String instruction) {

    }
}
