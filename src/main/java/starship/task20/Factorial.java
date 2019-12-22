package starship.task20;

import java.math.BigInteger;

public class Factorial {
    /**
     * Finds the sum of digits of a number after finding the factorial of that number.
     *
     * @param number the number from which the factorial will be found
     * @return sum of digits of a factorial number
     */
    public static int findDigitsSumFromNumberFactorial(int number) {
        String numericString = factorial(number).toString();
        int digitsSum = 0;
        for (int digitIndex = 0; digitIndex < numericString.length(); digitIndex++)
            digitsSum += Character.getNumericValue(numericString.charAt(digitIndex));
        return digitsSum;
    }

    /**
     * Finds the factorial of a number.
     *
     * @param number the number for which factorial is calculated
     * @return factorial of number
     */
    private static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int sequencNumber = 2; sequencNumber <= number; sequencNumber++)
            factorial = factorial.multiply(BigInteger.valueOf(sequencNumber));
        return factorial;
    }
}