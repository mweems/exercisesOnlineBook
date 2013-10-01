package chapters.marsRoverPairing;

public class NewPosition {

    enum Directions{
        NORTH {
            public Directions turnRight() {
                return EAST;
            }

            public Directions turnLeft() {
                return WEST;
            }

            public Coordinate move(Coordinate old) {
                return new Coordinate(old.x, old.y + 1);
            }
        },
        SOUTH {
            public Directions turnRight() {
                return WEST;
            }

            public Directions turnLeft() {
                return EAST;
            }

            public Coordinate move(Coordinate old) {
                return new Coordinate(old.x, old.y - 1);
            }
        },
        EAST {
            public Directions turnRight() {
                return SOUTH;
            }

            public Directions turnLeft() {
                return NORTH;
            }

            public Coordinate move(Coordinate old) {
                return new Coordinate(old.x + 1, old.y);
            }
        },
        WEST {
            public Directions turnRight() {
                return NORTH;
            }

            public Directions turnLeft() {
                return SOUTH;
            }

            public Coordinate move(Coordinate old) {
                return new Coordinate(old.x - 1, old.y);
            }
        };

        public abstract Directions turnRight();
        public abstract Directions turnLeft();
        public abstract Coordinate move(Coordinate oldPosition);
    }

    private Coordinate position;
    protected Directions direction;


    public NewPosition(int xCoordinate, int yCoordinate, Directions direction) {
        position = new Coordinate(xCoordinate, yCoordinate);
        this.direction = direction;
    }

    public int getXCoordinate() {
        return position.x;
    }

    public int getYCoordinate() {
        return position.y;
    }

    public void turnRight(){
        direction = direction.turnRight();
    }

    public void turnLeft(){
        direction = direction.turnLeft();
    }

    public void move(){
        position = direction.move(position);
    }

    public String getDirection() {
       return direction.name();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewPosition position = (NewPosition) o;

        if (getXCoordinate() != position.getXCoordinate()) return false;
        if (getYCoordinate() != position.getYCoordinate()) return false;
        if (direction != position.direction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getXCoordinate();
        result = 31 * result + getYCoordinate();
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
