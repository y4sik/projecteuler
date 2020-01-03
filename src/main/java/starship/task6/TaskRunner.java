package starship.task6;

public class TaskRunner {

    private static final int SEQUENCE_LIMIT = 100;

    /**
     * The sum of the squares of the first ten natural numbers is,
     * <p>
     * 1^2 + 2^2 + ... + 10^2 = 385
     * The square of the sum of the first ten natural numbers is,
     * <p>
     * (1 + 2 + ... + 10)^2 = 552 = 3025
     * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
     * <p>
     * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    public static void main(String[] args) {
        System.out.println(SquareDifference.findDifferenceBetweenSquareSumAndSumSquares(SEQUENCE_LIMIT));
    }
}
