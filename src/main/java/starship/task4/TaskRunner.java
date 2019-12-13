package starship.task4;

public class TaskRunner {

    private static final int MIN_THREE_DIGIT_NUMBER = 100;
    private static final int MAX_THREE_DIGIT_NUMBER = 999;

    public static void main(String[] args) {
        System.out.println(PalindromeManager.findLargestPalindrome(MIN_THREE_DIGIT_NUMBER, MAX_THREE_DIGIT_NUMBER));
    }
}
