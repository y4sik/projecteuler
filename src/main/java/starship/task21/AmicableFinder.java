package starship.task21;

public class AmicableFinder {
    /**
     * <p>
     * Find the sum of all the amicable numbers before [maxNumber].
     * </p>
     * Let d(n) be defined as the sum of proper divisors of
     * n (numbers less than n which divide evenly into n).
     * If d(a) = b and d(b) = a, where a ≠ b, then a and b
     * are an amicable pair and each of a and b are called
     * amicable numbers.
     *
     * @param maxNumber the limit for finding amicable numbers
     * @return sum of amicable numbers below limit
     */
    public static int sumOfAmicable(int maxNumber) {
        int sumAmicableNumbers = 0;
        for (int number = 0; number < maxNumber; number++) {
            if (isAmicable(number)) {
                sumAmicableNumbers += number;
            }
        }
        return sumAmicableNumbers;
    }

    /**
     * <p>
     * Check if number is amicable.
     * </p>
     * Let d(n) be defined as the sum of proper divisors of
     * n (numbers less than n which divide evenly into n).
     * If d(a) = b and d(b) = a, where a ≠ b, then a and b
     * are an amicable pair and each of a and b are called
     * amicable numbers.
     * <p>
     * For example, the proper divisors of 220 are 1, 2, 4,
     * 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
     * The proper divisors of 284 are 1, 2, 4, 71 and 142;
     * so d(284) = 220.
     * </p>
     *
     * @param number the number to check for amicability
     * @return true if number is amicable
     */
    private static boolean isAmicable(int number) {
        int dividersSum = findDividersSum(number);
        if (number != dividersSum) {
            return number == findDividersSum(dividersSum);
        }
        return false;
    }

    /**
     * Find all dividers of a number and summarizes them.
     *
     * @param number the number for which the divisors are found
     * @return sum of dividers
     */
    private static int findDividersSum(int number) {
        int dividersSum = 1;
        int lastDivisor = (int) Math.ceil(Math.sqrt(number));
        for (int divider = 2; divider <= lastDivisor; divider++) {
            if (number % divider == 0) {
                dividersSum += divider + number / divider;
            }
        }
        return dividersSum;
    }
}