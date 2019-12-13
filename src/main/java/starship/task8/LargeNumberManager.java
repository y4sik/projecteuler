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
        for (int i = 0; i < numericString.length() - countAdjacentDigits; i++) {
            long currentProduct = 1;
            for (int j = i; j < i + countAdjacentDigits; j++) {
                currentProduct *= Character.getNumericValue(numericString.charAt(j));
            }
            maxProduct = Math.max(maxProduct, currentProduct);
        }
        return maxProduct;
    }
}
