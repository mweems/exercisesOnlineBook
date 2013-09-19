package chapters.marsRover;

public class Grid {

    int XLength;
    int YLength;
    int[] gridSize = new int[2];

    public int[] gridSize(String size) {
        String[] grid = size.split(" ");
        XLength = Integer.parseInt(grid[0]);
        YLength = Integer.parseInt(grid[1]);
        gridSize[0] = XLength;
        gridSize[1] = YLength;

        return gridSize;
    }
}
