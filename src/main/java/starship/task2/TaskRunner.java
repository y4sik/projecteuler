package starship.task2;

public class TaskRunner {
    private static final int LIMIT = 4_000_000;

    /**
     * Each new term in the Fibonacci sequence is generated by
     * adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
     * <p>
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     * <p>
     * By considering the terms in the Fibonacci sequence whose
     * values do not exceed four million, find the sum of the even-valued terms.
     */
    public static void main(String[] args) {
        System.out.println(Fibonacci.findSumEvenFibonacciNumbers(LIMIT));
    }
}
