package starship.task20;

import java.math.BigInteger;

public class Factorial {
    /**
     * Finds the sum of digits of a number after finding the factorial of that number
     *
     * @param number the number from which the factorial will be found
     * @return sum of digits of a factorial number
     */
    public static int findSumOfDigitsFromFactorialOfNumber(int number) {
        String temp = factorial(number).toString();
        int sum = 0;
        for (int i = 0; i < temp.length(); i++)
            sum += Character.getNumericValue(temp.charAt(i));
        return sum;
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}