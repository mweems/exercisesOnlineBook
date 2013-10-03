package chapters.gameOfLife;

import java.util.ArrayList;

public class Grid {

    private ArrayList<ArrayList<Cell>> currentGrid = new ArrayList<ArrayList<Cell>>();

    public Grid(String start, String liveCell, String deadCell) throws Exception {
        String[] startString = start.split("\n");
        for(String line : startString){
            currentGrid.add(createGrid(line, liveCell, deadCell));
            if(!isEqual(currentGrid)) throw new Exception();
        }

    }

    private ArrayList<Cell> createGrid(String start, String liveCell, String deadCell) throws Exception {
       ArrayList<Cell> cells = new ArrayList<Cell>();
        for(int i = 0; i < start.length(); i++){
            if(String.valueOf(start.charAt(i)).equals(liveCell)){
                cells.add(new Cell(true));
            } else if(String.valueOf(start.charAt(i)).equals(deadCell)){
                cells.add(new Cell(false));
            }
        }
        return cells;
    }

    private boolean isEqual(ArrayList<ArrayList<Cell>> grid) {
        for (int i = 0; i < grid.size() - 1; i++) {
            if (grid.get(i).size() != grid.get(i + 1).size()) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<ArrayList<Cell>> tick() {
       return currentGrid;
    }
}
