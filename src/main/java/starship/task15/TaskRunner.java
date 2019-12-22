package starship.task15;

public class TaskRunner {

    private static final int COUNT_GRID_CELLS = 40;
    private static final int GRID_SIZE = 20;

    public static void main(String[] args) {
        System.out.println(LatticePath.findCountGridPaths(COUNT_GRID_CELLS, GRID_SIZE));
    }
}

