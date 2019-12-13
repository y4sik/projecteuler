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
    public static int findLargestPalindrome(int start, int end) {
        int maxPalindrome = -1;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                int product = i * j;
                if (isPalindrome(Integer.toString(product)) && product > maxPalindrome)
                    maxPalindrome = product;
            }
        }
        return maxPalindrome;
    }

    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}