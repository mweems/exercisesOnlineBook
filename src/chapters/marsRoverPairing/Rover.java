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

    public void move(int distance) {
        if(direction == "N" || direction == "S"){
            yCoordinate += distance;
        }else if(direction == "E" || direction == "W"){
            xCoordinate += distance;
        }
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }
}
