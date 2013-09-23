package chapters.marsRoverPairing;

public abstract class Position {
    public static final String NORTH="N";
    public static final String SOUTH="S";
    public static final String EAST="E";
    public static final String WEST="W";
    private String direction;
    protected int yCoordinate;
    protected int xCoordinate;

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

    public abstract void move();
    public abstract Position turnLeft();
    public abstract Position turnRight();

}

