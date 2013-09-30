package chapters.marsRoverPairing;

public abstract class Position {

    public static final String NORTH="N";
    public static final String SOUTH="S";
    public static final String EAST="E";
    public static final String WEST="W";
    private String direction;
    protected static int yCoordinate;
    protected static int xCoordinate;

    public Position(String direction) {
        this.direction = direction;
    }

    public static Position createPosition(int xCoordinate, int yCoordinate, String direction) {
        if(direction == Position.EAST) return new East(xCoordinate, yCoordinate);
        if(direction == Position.NORTH) return new North(xCoordinate, yCoordinate);
        if(direction == Position.WEST) return new West(xCoordinate, yCoordinate);
        if(direction == Position.SOUTH) return new South(xCoordinate, yCoordinate);

        return null;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public String getDirection() {
        return direction;
    }

    public abstract Position move();
    public abstract Position turnLeft();
    public abstract Position turnRight();


    @Override
    public boolean equals(Object position){

        if(position == null || position.getClass() != getClass()) return false;

        Position checkPosition = (Position) position;

        if(this.direction ==  checkPosition.direction &&
            this.xCoordinate == checkPosition.xCoordinate &&
            this.yCoordinate == checkPosition.yCoordinate){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + yCoordinate;
        result = 31 * result + xCoordinate;
        return result;
    }
}

