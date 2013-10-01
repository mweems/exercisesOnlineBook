package chapters.marsRoverPairing;

import java.util.ArrayList;

public class Grid {
    private Coordinate upperRight;
    private Coordinate lowerLeft = new Coordinate(0,0);
    private ArrayList<NewPosition> beacons = new ArrayList<NewPosition>();

    public Grid(int xLength, int yLength) {
        upperRight = new Coordinate(xLength, yLength);
    }

    public boolean hasBeaconAt(NewPosition position) {
        if(position == null) return false;
        return beacons.contains(position);
    }

    public void addBeacon(NewPosition position) {
      beacons.add(position);
    }


    public boolean isValidPosition(Coordinate coordinate) {
        if(coordinate.x < lowerLeft.x || coordinate.x > upperRight.x) return false;
        if(coordinate.y < lowerLeft.y || coordinate.y > upperRight.y) return false;

        return true;
    }
}
