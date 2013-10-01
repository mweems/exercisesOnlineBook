package chapters.marsRoverPairing;

public class Rover {


    private NewPosition currentPosition;
    private NewPosition lastPosition;

    private final Grid grid;
    private boolean isDead = false;
    private NewPosition.Directions newDirection;
    private NewPosition.Directions oldDirection;
    private Coordinate oldPosition;
    private Coordinate newPosition;

    public NewPosition getNewPosition() {
        return currentPosition;
    }

    public Rover(NewPosition position, Grid grid) {
        this.currentPosition = position;
        this.newDirection = position.direction;
        this.newPosition = new Coordinate(position.getXCoordinate(), position.getYCoordinate());
        this.grid = grid;
    }

    public void move() throws Exception {
        if(isDead) throw new Exception("This Rover is Dead");
        if(grid.hasBeaconAt(currentPosition)) return;

        lastPosition = currentPosition;
        currentPosition.move();

        oldPosition = newPosition;
        oldDirection = newDirection;
        newPosition = newDirection.move(newPosition);

        if(!grid.isValidPosition(new Coordinate(currentPosition.getXCoordinate(), currentPosition.getYCoordinate()))){
            grid.addBeacon(lastPosition);
            newDirection = oldDirection;
            newPosition = oldPosition;
            currentPosition = lastPosition;
            isDead = true;
        }
    }

    public void turnLeft() throws Exception {
        if(isDead) throw new Exception("This Rover is Dead");
        newDirection = newDirection.turnLeft();
        currentPosition.turnLeft();
    }

    public void turnRight() throws Exception {
        if(isDead) throw new Exception("This Rover is Dead");
        newDirection = newDirection.turnRight();
        currentPosition.turnRight();
    }

    public boolean isDead() {
        return isDead;
    }
}
