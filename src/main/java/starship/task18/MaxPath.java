package starship.task18;

public class MaxPath {
    /**
     * Find the maximum total from top to bottom of the triangle
     *
     * @param arr two-dimensional array in which the number of
     *            elements in the next row is one more than in the previous
     * @return the maximum total from top to bottom of the arr
     */
    public static int maxSumFromTopToBottom(int[][] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] += Math.max(arr[i + 1][j], arr[i + 1][j + 1]);
        }
        return arr[0][0];
    }
}
