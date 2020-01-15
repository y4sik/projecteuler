package starship.task6;

class SquareDifference {

    private static SquareDifference instance;

    private SquareDifference() {
    }

    static SquareDifference getInstance() {
        if (instance == null) {
            instance = new SquareDifference();
        }
        return instance;
    }

    /**
     * Find the difference between the square of the sum and
     * the sum of the squares of the natural numbers, in range [1, limit].
     *
     * @param sequenceLimit the restriction to which the square of the sum and the
     *                      sum of squares is calculated
     * @return difference between the square of the sum and the sum of the squares
     */
    int findDifferenceBetweenSquareSumAndSumSquares(int sequenceLimit) {
        int sumSquares = 0;
        int numbersSum = 0;
        for (int number = 1; number <= sequenceLimit; number++) {
            sumSquares += number * number;
            numbersSum += number;
        }
        return numbersSum * numbersSum - sumSquares;
    }
}
