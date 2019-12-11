package starship.task11;

public class LargestProductInGrid {

    /**
     * Find greatest product of n adjacent numbers in the same direction
     *
     * @param arr the array in which searches will occur
     * @param n   the count of adjacent numbers
     * @return the greatest product of adjacent n numbers
     */
    public static int findLargestProductInGrid(int[][] arr, int n) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(downProduct(i, j, n, arr), max);
                max = Math.max(rightProduct(i, j, n, arr), max);
                max = Math.max(diagonalToRightProduct(i, j, n, arr), max);
                max = Math.max(diagonalToLeftProduct(i, j, n, arr), max);
            }
        }
        return max;
    }

    private static boolean isInBound(int i, int j, int[][] arr) {
        return i < 0 || i >= arr.length || j < 0 || j >= arr[i].length;
    }

    private static int downProduct(int i, int j, int n, int[][] arr) {
        if (isInBound(i + (n - 1), j, arr))
            return -1;
        int product = 1;
        for (int k = 0; k < n; k++) {
            product *= arr[i + k][j];
        }
        return product;
    }

    private static int rightProduct(int i, int j, int n, int[][] arr) {
        if (isInBound(i, j + (n - 1), arr))
            return -1;
        int product = 1;
        for (int k = 0; k < n; k++) {
            product *= arr[i][j + k];
        }
        return product;
    }

    private static int diagonalToRightProduct(int i, int j, int n, int[][] arr) {
        if (isInBound(i + (n - 1), j + (n - 1), arr))
            return -1;
        int product = 1;
        for (int k = 0; k < n; k++) {
            product *= arr[i + k][j + k];
        }
        return product;
    }

    private static int diagonalToLeftProduct(int i, int j, int n, int[][] arr) {
        if (isInBound(i + (n - 1), j - (n - 1), arr))
            return -1;
        int product = 1;
        for (int k = 0; k < n; k++) {
            product *= arr[i + k][j - k];
        }
        return product;
    }
}
