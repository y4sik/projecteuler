package starship.task18;

import java.util.Arrays;
import java.util.Objects;

public class MaxPath {
    /**
     * Find the maximum sum from top to bottom of the triangle.
     *
     * @param triangleArray two-dimensional array in which the number of
     *                      elements in the next row is one more than in the previous
     * @return the maximum sum from top to bottom of the arr
     */
    public static int maxSumFromTopToBottom(int[][] triangleArray) {
        int[][] triangleArrayCopy = copyArray(triangleArray);
        for (int rowIndex = triangleArrayCopy.length - 2; rowIndex >= 0; rowIndex--) {
            for (int columnIndex = 0; columnIndex < triangleArrayCopy[rowIndex].length; columnIndex++) {
                triangleArrayCopy[rowIndex][columnIndex] +=
                        Math.max(triangleArrayCopy[rowIndex + 1][columnIndex], triangleArrayCopy[rowIndex + 1][columnIndex + 1]);
            }
        }
        return triangleArrayCopy[0][0];
    }

    private static int[][] copyArray(int[][] array) {
        int[][] copiedArray = new int[array.length][];
        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            copiedArray[rowIndex] = Arrays.copyOf(array[rowIndex], array[rowIndex].length);
        }
        return copiedArray;
    }
}
