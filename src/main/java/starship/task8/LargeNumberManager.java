package starship.task8;

import java.math.BigInteger;

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
        if (countAdjacentDigits < 0 || countAdjacentDigits > numericString.length()) {
            throw new IllegalArgumentException("Count Adjacent digits must be in range [0, numericString.length() - 1]");
        }
        throwExceptionIfStringNotNumeric(numericString);

        boolean numericStringNegative = false;
        if (Character.getNumericValue(numericString.charAt(0)) == -1) {
            numericStringNegative = true;
            numericString = numericString.substring(1);
        }

        long maxProduct = Long.MIN_VALUE;
        for (int rowIndex = 0; rowIndex <= numericString.length() - countAdjacentDigits; rowIndex++) {
            long currentProduct = 1;
            if (rowIndex == 0 && numericStringNegative) {
                currentProduct = -1;
            }
            for (int columnIndex = rowIndex; columnIndex < rowIndex + countAdjacentDigits; columnIndex++) {
                currentProduct *= Character.getNumericValue(numericString.charAt(columnIndex));
            }
            maxProduct = Math.max(maxProduct, currentProduct);
        }
        return maxProduct;
    }

    private static void throwExceptionIfStringNotNumeric(String numericString) {
        new BigInteger(numericString);
    }
}
