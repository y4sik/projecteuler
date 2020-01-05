package starship.task15;

public class TaskRunner {

    private static final int COUNT_GRID_CELLS = 40;
    private static final int GRID_SIZE = 20;

    /**
     * Starting in the top left corner of a 2×2 grid, and only being able to
     * move to the right and down, there are exactly 6 routes to the bottom
     * right corner.
     * <p>
     * How many such routes are there through a 20×20 grid?
     */
    public static void main(String[] args) {
        System.out.println(LatticePath.findCountGridPaths(COUNT_GRID_CELLS, GRID_SIZE));
    }
}

