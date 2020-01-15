package starship.task.task6;

public class SquareDifference {

    /**
     * Find the difference between the square of the sum and
     * the sum of the squares of the natural numbers, in range [1, limit].
     *
     * @param sequenceLimit the restriction to which the square of the sum and the
     *                      sum of squares is calculated
     * @return difference between the square of the sum and the sum of the squares
     */
    public static int findDifferenceBetweenSquareSumAndSumSquares(int sequenceLimit) {
        int sumSquares = 0;
        int numbersSum = 0;
        for (int number = 1; number <= sequenceLimit; number++) {
            sumSquares += number * number;
            numbersSum += number;
        }
        return numbersSum * numbersSum - sumSquares;
    }
}
