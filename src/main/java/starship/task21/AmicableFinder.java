package starship.task21;

public class AmicableFinder {
    /**
     * <p>
     * Find the sum of all the amicable numbers under limit.
     * </p>
     * Let d(n) be defined as the sum of proper divisors of
     * n (numbers less than n which divide evenly into n).
     * If d(a) = b and d(b) = a, where a ≠ b, then a and b
     * are an amicable pair and each of a and b are called
     * amicable numbers.
     *
     * @param limit the limit for finding amicable numbers
     * @return sum of amicable numbers below limit
     */
    public static int sumOfAmicable(int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            if (isAmicable(i)) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Check if n is amicable number.
     *
     * @param n number to check for amicability
     * @return true if number is amicable
     */
    private static boolean isAmicable(int n) {
        int m = sumOfDividers(n);
        if (n != m) {
            return n == sumOfDividers(m);
        }
        return false;
    }

    /**
     * Find all dividers of a number and summarizes them.
     *
     * @param number the number for which the divisors are found
     * @return sum of dividers
     */
    private static int sumOfDividers(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}