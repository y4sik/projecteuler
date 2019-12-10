package starship.task14;

public class TaskRunner {
    private static final int LIMIT = 1_000_000;

    public static void main(String[] args) {
        System.out.println(Task14.findLongestCollatzSequence(LIMIT));
    }
}
