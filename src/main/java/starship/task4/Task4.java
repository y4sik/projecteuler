package starship.task4;

public class Task4 {
    public static int maxPalindrome(int limit) {
        int maxPalindrome = -1;
        for (int i = 100; i <= limit; i++) {
            for (int j = 100; j <= limit; j++) {
                int product = i * j;
                if (isPalindrome(Integer.toString(product)) && product > maxPalindrome)
                    maxPalindrome = product;
            }
        }
        return maxPalindrome;
    }

    private static boolean isPalindrome(String str) {
        if (str.equals(new StringBuilder(str).reverse().toString())) {
            return true;
        }
        return false;
    }


}
