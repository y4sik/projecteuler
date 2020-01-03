package starship.task4;

public class PalindromeManager {
    /**
     * Finds the largest palindrome made by the product of two numbers, from start to end
     * A palindromic number reads the same both ways.
     *
     * @param start the number at which multiplication begins
     * @param end   the number at which multiplication ends
     * @return largest palindrome
     */
    public static Integer findLargestPalindromeOfNumbersProduct(int start, int end) {
        if (start < 0 || end <= start) {
            throw new IllegalArgumentException("Start must be greatest than 0 (start > 0)," +
                    " and must be greatest than start (end > start)");
        }
        int maxPalindrome = -1;
        for (int currentNumber1 = end; currentNumber1 >= start + ((start - end) / 2); currentNumber1--) {
            for (int currentNumber2 = end; currentNumber2 >= start; currentNumber2--) {
                int product = currentNumber1 * currentNumber2;
                if (isPalindrome(Integer.toString(product)) && product > maxPalindrome) {
                    maxPalindrome = product;
                }

            }
        }
        return maxPalindrome == -1 ? null : maxPalindrome;
    }

    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}