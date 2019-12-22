package starship.task14;

public class TaskRunner {
    private static final int LAST_NUMBER_IN_SEQUENCE_FOR_FINDING_CHAIN = 1_000_000;

    public static void main(String[] args) {
        System.out.println(CollatzSequence.findLongestCollatzSequence(LAST_NUMBER_IN_SEQUENCE_FOR_FINDING_CHAIN));
    }
}
