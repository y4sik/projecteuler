package starship.task4;

public class Task4 {
    public static int maxPalindrome(int limit) {
        int maxPalindrome = -1;
        for (int i = 100; i <= limit; i++) {
            for (int j = 100; j <= limit; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > maxPalindrome)
                    maxPalindrome = product;
            }
        }
        return maxPalindrome;
    }

    private static boolean isPalindrome(int number) {
        String stringFromNumber = Integer.toString(number);
        if (stringFromNumber.equals(new StringBuilder(stringFromNumber).reverse().toString())) {
            return true;
        }
        return false;
    }


}
