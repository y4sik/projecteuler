package starship.task11;

public class LargestProductInGrid {

    /**
     * Find greatest product of [countElementsForProduct] adjacent numbers in the same direction.
     *
     * @param array                   the array in which searches will occur
     * @param countElementsForProduct the count of adjacent elements in arr, involved in product
     * @return the greatest product of adjacent n numbers
     */
    public static int findLargestProductInGrid(int[][] array, int countElementsForProduct) {
        int max = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max = Math.max(downProduct(i, j, countElementsForProduct, array), max);
                max = Math.max(rightProduct(i, j, countElementsForProduct, array), max);
                max = Math.max(diagonalToRightProduct(i, j, countElementsForProduct, array), max);
                max = Math.max(diagonalToLeftProduct(i, j, countElementsForProduct, array), max);
            }
        }
        return max;
    }

    /**
     * Checks that the rowIndex and columnIndex of the element is at the boundary of the array
     *
     * @param rowIndex    index of row in array
     * @param columnIndex index of column in array
     * @param array       the array boundaries, which are used to verify
     * @return true if rowIndex and columnIndex in the boundary of the array
     */
    private static boolean isIndexOfElementInArrayBoundaries(int rowIndex, int columnIndex, int[][] array) {
        return rowIndex < 0 || rowIndex >= array.length || columnIndex < 0 || columnIndex >= array[rowIndex].length;
    }

    /**
     * Finding a product of [countElementsForProduct] elements in array vertically down.
     *
     * @param rowIndex                index of row in array
     * @param columnIndex             index of column in array
     * @param countElementsForProduct the number of elements involved in product
     * @param array                   array, whose elements are multiplied
     * @return product of [countElementsForProduct] elements vertically down
     */
    private static int downProduct(int rowIndex, int columnIndex, int countElementsForProduct, int[][] array) {
        if (isIndexOfElementInArrayBoundaries(rowIndex + (countElementsForProduct - 1), columnIndex, array))
            return -1;
        int product = 1;
        for (int offset = 0; offset < countElementsForProduct; offset++) {
            product *= array[rowIndex + offset][columnIndex];
        }
        return product;
    }

    /**
     * Finding a product of [countElementsForProduct] elements in array horizontally right.
     *
     * @param rowIndex                index of row in array
     * @param columnIndex             index of column in array
     * @param countElementsForProduct the number of elements involved in product
     * @param array                   array, whose elements are multiplied
     * @return product of [countElementsForProduct] elements horizontally right
     */
    private static int rightProduct(int rowIndex, int columnIndex, int countElementsForProduct, int[][] array) {
        if (isIndexOfElementInArrayBoundaries(rowIndex, columnIndex + (countElementsForProduct - 1), array))
            return -1;
        int product = 1;
        for (int offset = 0; offset < countElementsForProduct; offset++) {
            product *= array[rowIndex][columnIndex + offset];
        }
        return product;
    }

    /**
     * Finding a product of [countElementsForProduct] elements in array diagonally to the right.
     *
     * @param rowIndex                index of row in array
     * @param columnIndex             index of column in array
     * @param countElementsForProduct the number of elements involved in product
     * @param array                   array, whose elements are multiplied
     * @return product of [countElementsForProduct] elements diagonally to the right
     */
    private static int diagonalToRightProduct(int rowIndex, int columnIndex, int countElementsForProduct, int[][] array) {
        if (isIndexOfElementInArrayBoundaries(rowIndex + (countElementsForProduct - 1),
                columnIndex + (countElementsForProduct - 1), array))
            return -1;
        int product = 1;
        for (int offset = 0; offset < countElementsForProduct; offset++) {
            product *= array[rowIndex + offset][columnIndex + offset];
        }
        return product;
    }

    /**
     * Finding a product of [countElementsForProduct] elements in array diagonally to the left.
     *
     * @param rowIndex                index of row in array
     * @param columnIndex             index of column in array
     * @param countElementsForProduct the number of elements involved in product
     * @param array                   array, whose elements are multiplied
     * @return product of [countElementsForProduct] elements diagonally to the left
     */
    private static int diagonalToLeftProduct(int rowIndex, int columnIndex, int countElementsForProduct, int[][] array) {
        if (isIndexOfElementInArrayBoundaries(rowIndex + (countElementsForProduct - 1),
                columnIndex - (countElementsForProduct - 1), array))
            return -1;
        int product = 1;
        for (int offset = 0; offset < countElementsForProduct; offset++) {
            product *= array[rowIndex + offset][columnIndex - offset];
        }
        return product;
    }
}
