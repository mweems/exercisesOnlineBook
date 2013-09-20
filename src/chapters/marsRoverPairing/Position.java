package chapters.marsRoverPairing;

public abstract class Position {
    public static final String NORTH="N";
    public static final String SOUTH="S";
    public static final String EAST="E";
    public static final String WEST="W";
    private String direction;

    public Position(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public abstract Position turnLeft();

    public static Position createPosition(String direction) {
        if(direction == Position.EAST) return new East();
        if(direction == Position.NORTH) return new North();
        if(direction == Position.WEST) return new West();
        if(direction == Position.SOUTH) return new South();

        return null;
    }
}

