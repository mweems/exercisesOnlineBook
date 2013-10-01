package chapters.gameOfLife;

public class Cell {

    private boolean alive;

    public Cell(boolean isAlive) {
        alive = isAlive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void die() {
        alive = false;
    }

    public void live() {
        alive = true;
    }
}
