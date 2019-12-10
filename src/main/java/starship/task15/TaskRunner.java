package starship.task15;

public class TaskRunner {

    private static final int N = 40;
    private static final int K = 20;

    public static void main(String[] args) {
        System.out.println(LatticePath.findQuantityOfRoutes(N, K));
    }
}

