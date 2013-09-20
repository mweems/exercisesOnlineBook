package chapters.marsRoverPairing;

public class Rover {
    private int xCoordinate;
    private int yCoordinate;
    private String direction;

    public Rover(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public void move() {
        if(direction == CardinalDirections.NORTH || direction == CardinalDirections.SOUTH){
            yCoordinate += 1;
        }else if(direction == CardinalDirections.EAST || direction == CardinalDirections.WEST){
            xCoordinate += 1;
        }
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }


    public String getDirection() {
        return direction;
    }

    public void turnLeft() {
        if (direction == CardinalDirections.WEST) direction = CardinalDirections.SOUTH;
        else if (direction == CardinalDirections.EAST) direction = CardinalDirections.NORTH;
        else if (direction == CardinalDirections.NORTH) direction = CardinalDirections.WEST;
        else if (direction == CardinalDirections.SOUTH) direction = CardinalDirections.EAST;
    }

    public class CardinalDirections {
        private static final String NORTH="N";
        private static final String SOUTH="S";
        private static final String EAST="E";
        private static final String WEST="W";
    }
}
