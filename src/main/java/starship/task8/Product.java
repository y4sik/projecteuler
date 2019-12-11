package starship.task8;

public class Product {
    
    /**
     * Find the largest product of adjacent digits
     *
     * @param adjacentCount the count of digits involved in the multiplication
     * @param number        the number digits of which will be used to search for
     *                      the largest product
     * @return largest product
     */
    public static long largestProductInSeries(int adjacentCount, String number) {
        long maxProduct = 1;
        for (int i = 0; i < number.length() - adjacentCount; i++) {
            long currentProduct = 1;
            for (int j = i; j < i + adjacentCount; j++) {
                currentProduct *= Character.getNumericValue(number.charAt(j));
            }
            maxProduct = Math.max(maxProduct, currentProduct);
        }
        return maxProduct;
    }
}
