package starship.task6;

public class SquareDifference {

    /**
     * Find the difference between the square of the sum and
     * the sum of the squares of the natural numbers, in range [1, limit].
     *
     * @param limit the restriction to which the square of the sum and the
     *              sum of squares is calculated
     * @return difference between the square of the sum and the sum of the squares
     */

    public static int findSquareDifference(int limit) {
        int sumOfSquare = 0;
        int squareOfSum = 0;
        for (int i = 1; i <= limit; i++) {
            sumOfSquare += i * i;
            squareOfSum += i;
        }
        return squareOfSum * squareOfSum - sumOfSquare;
    }
}
