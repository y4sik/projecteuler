package starship.task5;

public class Multiple {

    /**
     * Find the smallest positive number that is evenly divisible
     * by all of the numbers in range [from, to].
     *
     * @param from the number from which the multiplicity test begins
     * @param to   the number at which the multiplicity test ends
     * @return smallest multiple
     */
    public static long findSmallestMultiple(int from, int to) {
        long lcm = 1;
        for (int i = from; i <= to; i++) {
            lcm = leastCommonMultiple(i, lcm);
            System.out.println(lcm);
        }
        return lcm;
    }

    /**
     * Find the least common multiple of two numbers.
     *
     * @param a value with which the LCM is to be computed
     * @param b value with which the LCM is to be computed
     * @return the least common multiple of numbers a and b
     */
    private static long leastCommonMultiple(long a, long b) {
        return a * b / greatestCommonDivisor(a, b);
    }

    /**
     * Find the greatest common divisor of two numbers.
     *
     * @param a value with which the GCD is to be computed
     * @param b value with which the GCD is to be computed
     * @return greatest common divisor of numbers a and b
     */
    private static long greatestCommonDivisor(long a, long b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Negative number");
        while (b != 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}