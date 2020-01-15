package starship.task.task5;

public class Multiple {

    /**
     * Find the smallest positive number that is evenly divisible
     * by all of the numbers in range [from, to].
     *
     * @param from the number from which the multiplicity test begins
     * @param to   the number at which the multiplicity test ends
     * @return smallest multiple
     */
    public static long findSmallestNumberDividedByNumbersInRange(int from, int to) {
        long leastCommonMultiple = 1;
        for (int number = from; number <= to; number++) {
            leastCommonMultiple = findLeastCommonMultiple(number, leastCommonMultiple);
        }
        return leastCommonMultiple;
    }

    /**
     * Find the least common multiple of two numbers.
     *
     * @param number1 value with which the LCM is to be computed
     * @param number2 value with which the LCM is to be computed
     * @return the least common multiple of numbers a and b
     */
    private static long findLeastCommonMultiple(long number1, long number2) {
        return number1 * number2 / findGreatestCommonDivisor(number1, number2);
    }

    /**
     * Find the greatest common divisor of two numbers.
     *
     * @param number1 value with which the GCD is to be computed
     * @param number2 value with which the GCD is to be computed
     * @return greatest common divisor of numbers a and b
     */
    private static long findGreatestCommonDivisor(long number1, long number2) {
        while (number2 != 0) {
            long divisionRemainder = number1 % number2;
            number1 = number2;
            number2 = divisionRemainder;
        }
        return number1;
    }
}