package starship.task15;

import java.math.BigInteger;

public class LatticePath {
    /**
     * Counts the number of routes using the formula C=n!/(k!/(n-k)!)
     * A k-combination of a set S is a subset of k distinct elements of S.
     * If the set has n elements, the number of k-combinations is equal to
     * the binomial coefficient.
     *
     * @param countGridCells countGridElements = gridSize * gridSize
     * @param gridSize       the grid size
     * @return count of routes in a grid
     */
    public static BigInteger findCountGridPaths(int countGridCells, int gridSize) {
        return factorial(countGridCells).divide(factorial(gridSize).multiply(factorial(countGridCells - gridSize)));
    }

    /**
     * Finds the factorial of a number.
     *
     * @param number the number for which factorial is calculated
     * @return factorial of number
     */
    private static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int sequencNumber = 2; sequencNumber <= number; sequencNumber++) {
            factorial = factorial.multiply(BigInteger.valueOf(sequencNumber));
        }
        return factorial;
    }

}
