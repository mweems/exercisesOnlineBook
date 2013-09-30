package chapters.marsRoverPairing;

public class Rover {


    private NewPosition currentPosition;
    private final Grid grid;
    private NewPosition lastPosition;
    private boolean isDead = false;

    public NewPosition getPosition() {
        return currentPosition;
    }

    public Rover(NewPosition position, Grid grid) {
        this.currentPosition = position;
        this.grid = grid;
    }

    public void move() throws Exception {
        if(isDead) throw new Exception("This Rover is Dead");
        if(grid.hasBeaconAt(currentPosition)) return;

        lastPosition = currentPosition;
        currentPosition = currentPosition.move();

        if(!grid.isValidPosition(new Coordinate(currentPosition.getXCoordinate(), currentPosition.getYCoordinate()))){
            grid.addBeacon(lastPosition);
            currentPosition = lastPosition;
            isDead = true;
        }
    }

    public void turnLeft() throws Exception {
        if(isDead) throw new Exception("This Rover is Dead");
        currentPosition.turnLeft();
    }

    public void turnRight() throws Exception {
        if(isDead) throw new Exception("This Rover is Dead");
        currentPosition.turnRight();
    }

    public boolean isDead() {
        return isDead;
    }
}
