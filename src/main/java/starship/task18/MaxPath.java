package starship.task18;

public class MaxPath {
    /**
     * Find the maximum sum from top to bottom of the triangle.
     *
     * @param triangleArray two-dimensional array in which the number of
     *                      elements in the next row is one more than in the previous
     * @return the maximum sum from top to bottom of the arr
     */
    public static int maxSumFromTopToBottom(int[][] triangleArray) {
        for (int rowIndex = triangleArray.length - 2; rowIndex >= 0; rowIndex--) {
            for (int columnIndex = 0; columnIndex < triangleArray[rowIndex].length; columnIndex++)
                triangleArray[rowIndex][columnIndex] +=
                        Math.max(triangleArray[rowIndex + 1][columnIndex], triangleArray[rowIndex + 1][columnIndex + 1]);
        }
        return triangleArray[0][0];
    }
}
