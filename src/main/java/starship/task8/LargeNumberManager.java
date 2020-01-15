package starship.task8;

public class LargeNumberManager {

    /**
     * Find the largest product of adjacent digits in a numeric string
     *
     * @param countAdjacentDigits the count of adjacent digits involved in the multiplication
     * @param numericString       the string of digits, which will be used to search the
     *                            largest product
     * @return largest product
     */
    public static long largestProductInSeries(int countAdjacentDigits, String numericString) {
        long maxProduct = 1;
        for (int rowIndex = 0; rowIndex < numericString.length() - countAdjacentDigits; rowIndex++) {
            long currentProduct = 1;
            for (int columnIndex = rowIndex; columnIndex < rowIndex + countAdjacentDigits; columnIndex++) {
                currentProduct *= Character.getNumericValue(numericString.charAt(columnIndex));
            }
            maxProduct = Math.max(maxProduct, currentProduct);
        }
        return maxProduct;
    }
}
