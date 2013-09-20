package chapters.marsRoverPairing;

public class CardinalDirection {
    public static final String NORTH="N";
    public static final String SOUTH="S";
    public static final String EAST="E";
    public static final String WEST="W";
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
