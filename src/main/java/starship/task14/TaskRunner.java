package starship.task14;

public class TaskRunner {
    private static final int LAST_NUMBER_IN_SEQUENCE_FOR_FINDING_CHAIN = 1_000_000;

    /**
     * The following iterative sequence is defined for the set of positive integers:
     * <p>
     * n → n/2 (n is even)
     * n → 3n + 1 (n is odd)
     * <p>
     * Using the rule above and starting with 13, we generate the following sequence:
     * <p>
     * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
     * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
     * Although it has not been proved yet (Collatz Problem), it is thought that all starting
     * numbers finish at 1.
     * <p>
     * Which starting number, under one million, produces the longest chain?
     * <p>
     * NOTE: Once the chain starts the terms are allowed to go above one million.
     */
    public static void main(String[] args) {
        System.out.println(CollatzSequence.findLongestCollatzSequence(LAST_NUMBER_IN_SEQUENCE_FOR_FINDING_CHAIN));
    }
}
