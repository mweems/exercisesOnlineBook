package chapters.marsRoverPairing;

public class NewPosition {

    public String addString() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    enum Directions{ N, S, E, W }

    private int xCoordinate;
    private int yCoordinate;
    private Directions direction;


    public NewPosition(int xCoordinate, int yCoordinate, Directions direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void turnRight() {
        switch (direction){
            case N: direction = Directions.E;
                break;
            case W: direction = Directions.N;
                break;
            case S: direction = Directions.W;
                break;
            case E: direction = Directions.S;
                break;
        }
    }

    public void turnLeft() {
       switch (direction){
           case N: direction = Directions.W;
               break;
           case W: direction = Directions.S;
               break;
           case S: direction = Directions.E;
               break;
           case E: direction = Directions.N;
                break;
       }
    }

    public NewPosition move() {
       switch (direction){
           case E: return new NewPosition(xCoordinate + 1, yCoordinate, Directions.E);
           case W: return new NewPosition(xCoordinate - 1, yCoordinate, Directions.W);
           case N: return new NewPosition(xCoordinate, yCoordinate + 1, Directions.N);
           case S: return new NewPosition(xCoordinate, yCoordinate - 1, Directions.S);
       }
        return null;
    }

    public String getDirection() {
       return direction.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewPosition position = (NewPosition) o;

        if (xCoordinate != position.xCoordinate) return false;
        if (yCoordinate != position.yCoordinate) return false;
        if (direction != position.direction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xCoordinate;
        result = 31 * result + yCoordinate;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
