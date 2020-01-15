package starship.task1;


public class TaskRunner {
    private static final int LIMIT = 1000;
    private static final int NUMBER_A = 3;
    private static final int NUMBER_B = 5;

    /**
     * If we list all the natural numbers below 10 that are
     * multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of
     * these multiples is 23.
     * <p>
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */
    public static void main(String[] args) {
        MultipleManager multipleManager = MultipleManager.getInstance();
        System.out.println(multipleManager.findSumNumbersMultipleToArrayElements(LIMIT, NUMBER_A, NUMBER_B));
    }
}
