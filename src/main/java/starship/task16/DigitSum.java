package starship.task16;

import java.math.BigInteger;

public class DigitSum {
    /**
     * Find sum of digits of number in a degree
     *
     * @param number the number raised to a power
     * @param degree the degree to which the number is raised
     * @return sum of digits of number in a degree
     */
    public static int findDigitSum(int number, int degree) {
        String numericString = BigInteger.valueOf(number).pow(degree).toString();
        int sum = 0;
        for (int i = 0; i < numericString.length(); i++) {
            sum += Character.getNumericValue(numericString.charAt(i));
        }
        return sum;
    }
}
