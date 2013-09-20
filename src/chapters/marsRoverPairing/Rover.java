package chapters.marsRoverPairing;

public class Rover {
    private int xCoordinate;
    private int yCoordinate;
    private Position position;

    public Rover(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.position = Position.createPosition(direction);
    }

    /*          ;
        option 1 :
            positon == North += y
            North.move
     */

    public void move() {
        if (position.getDirection() == Position.NORTH) {
            yCoordinate += 1;
        } else if (position.getDirection() == Position.EAST){
            xCoordinate += 1;
        } else if (position.getDirection() == Position.SOUTH) yCoordinate -= 1;
        else if (position.getDirection() == Position.WEST) xCoordinate -= 1;
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
        position = position.turnLeft();
    }

    public void turnRight() {
        if (position.getDirection() == Position.SOUTH) position.setDirection(Position.WEST);
        else if (position.getDirection() == Position.NORTH) position.setDirection(Position.EAST);
        else if (position.getDirection() == Position.EAST) position.setDirection(Position.SOUTH);
        else if (position.getDirection() == Position.WEST) position.setDirection(Position.NORTH);
    }

}
