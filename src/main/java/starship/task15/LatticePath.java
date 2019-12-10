package starship.task15;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LatticePath {
    /**
     * Counts the number of routes using the formula C=n!/(k!/(n-k)!)
     * @param n
     * @return count of routes
     */
    public static BigInteger findQuantityOfRoutes(int n, int k) {
        new HashMap<>().put(1, "one");
        Arrays.binarySearch(new int[]{1, 2}, 1);
        return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
    }


    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}
