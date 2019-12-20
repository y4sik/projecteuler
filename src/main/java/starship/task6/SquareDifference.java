package starship.task6;

public class SquareDifference {

    /**
     * Find the difference between the square of the sum and
     * the sum of the squares of the natural numbers, in range [1, limit].
     *
     * @param sequenceLimit the restriction to which the square of the sum and the
     *                      sum of squares is calculated
     * @return difference between the square of the sum and the sum of the squares
     */
    public static int findDifferenceBetweenSquaresSumAndSumSquare(int sequenceLimit) {
        int sumSquare = 0;
        int squaresSum = 0;
        for (int number = 1; number <= sequenceLimit; number++) {
            sumSquare += number * number;
            squaresSum += number;
        }
        return squaresSum * squaresSum - sumSquare;
    }
}
