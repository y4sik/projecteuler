package starship.task1;

public class TaskRunner {
    private static final int LIMIT = 1000;
    private static final int A = 3;
    private static final int B = 5;

    public static void main(String[] args) {
        System.out.println(Multiple.findMultiples(LIMIT, A, B));
    }
}
