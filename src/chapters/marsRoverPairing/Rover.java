package chapters.marsRoverPairing;

public class Rover {
    private int xCoordinate;
    private int yCoordinate;
    private CardinalDirection position;

    public Rover(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.position = new CardinalDirection(direction);
    }

    public void move() {
        if (position.getDirection() == CardinalDirection.NORTH || position.getDirection() == CardinalDirection.SOUTH) {
            yCoordinate += 1;
        } else if (position.getDirection() == CardinalDirection.EAST || position.getDirection() == CardinalDirection.WEST) {
            xCoordinate += 1;
        }
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }


    public String getPosition() {
        return position.getDirection();
    }

    public void turnLeft() {
        if (position.getDirection() == CardinalDirection.WEST) position.setDirection(CardinalDirection.SOUTH);
        else if (position.getDirection() == CardinalDirection.EAST) position.setDirection(CardinalDirection.NORTH);
        else if (position.getDirection() == CardinalDirection.NORTH) position.setDirection(CardinalDirection.WEST);
        else if (position.getDirection() == CardinalDirection.SOUTH) position.setDirection(CardinalDirection.EAST);
    }

    public void turnRight() {
        if (position.getDirection() == CardinalDirection.SOUTH) position.setDirection(CardinalDirection.WEST);
        else if (position.getDirection() == CardinalDirection.NORTH) position.setDirection(CardinalDirection.EAST);
        else if (position.getDirection() == CardinalDirection.EAST) position.setDirection(CardinalDirection.SOUTH);
        else if (position.getDirection() == CardinalDirection.WEST) position.setDirection(CardinalDirection.NORTH);
    }

    public class CardinalDirection {
        private static final String NORTH="N";
        private static final String SOUTH="S";
        private static final String EAST="E";
        private static final String WEST="W";
        private String direction;

        public CardinalDirection(String direction) {
            this.direction = direction;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }
    }
}
