package starship.task1;

public class TaskRunner {
    private static final int LIMIT = 1000;
    private static final int NUMBER_A = 3;
    private static final int NUMBER_B = 5;

    public static void main(String[] args) {
        System.out.println(Multiple.findMultipleNumbersToArrayElements(LIMIT, NUMBER_A, NUMBER_B));
    }
}
