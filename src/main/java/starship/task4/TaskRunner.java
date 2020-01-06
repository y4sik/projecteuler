package starship.task4;

public class TaskRunner {

    private static final int MIN_THREE_DIGIT_NUMBER = 100;
    private static final int MAX_THREE_DIGIT_NUMBER = 999;

    /**
     * A palindromic number reads the same both ways. The largest
     * palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * <p>
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static void main(String[] args) {
        System.out.println(PalindromeManager.findLargestPalindromeOfNumbersProduct(MIN_THREE_DIGIT_NUMBER, MAX_THREE_DIGIT_NUMBER));
    }
}
