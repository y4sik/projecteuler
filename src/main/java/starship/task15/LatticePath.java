package starship.task15;

import java.math.BigInteger;

public class LatticePath {
    /**
     * Counts the number of routes using the formula C=n!/(k!/(n-k)!)
     * A k-combination of a set S is a subset of k distinct elements of S.
     * If the set has n elements, the number of k-combinations is equal to
     * the binomial coefficient.
     *
     * @param n n=2k
     * @param k grid size, k ≥ 0
     * @return count of routes in a grid {k,k} size.
     */
    public static BigInteger findQuantityOfRoutes(int n, int k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}
