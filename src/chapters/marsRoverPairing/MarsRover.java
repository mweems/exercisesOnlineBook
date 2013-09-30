package chapters.marsRoverPairing;

public class MarsRover {

    private String finalPosition;

    public static void main(String[] args) {
        Rover rover = new Rover(new NewPosition(0, 0, NewPosition.Directions.N), null);
        NewPosition position = rover.getPosition();
        System.out.println(.addString());
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
