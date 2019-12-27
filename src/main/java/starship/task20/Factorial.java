package starship.task20;

import java.math.BigInteger;
import java.util.HashMap;

public class Factorial {

    private static HashMap<Integer, BigInteger> cacheNumbersFactorial = new HashMap<>();

    /**
     * Finds the sum of digits of a number after finding the factorial of that number.
     *
     * @param number the number from which the factorial will be found
     * @return sum of digits of a factorial number
     */
    public static int findDigitsSumFromNumberFactorial(int number) {
        BigInteger numberFactorial;
        if (isNumberInCache(number)) {
            numberFactorial = cacheNumbersFactorial.get(number);
        } else {
            numberFactorial = factorial(number);
            cacheNumbersFactorial.put(number, numberFactorial);
        }

        return findNumberDigitsSum(numberFactorial);
    }

    private static boolean isNumberInCache(int number) {
        if (cacheNumbersFactorial.containsKey(number)) {
            return true;
        }
        return false;
    }

    /**
     * Finds the factorial of a number.
     *
     * @param number the number for which factorial is calculated
     * @return factorial of number
     */
    private static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int sequenceNumber = 2; sequenceNumber <= number; sequenceNumber++)
            factorial = factorial.multiply(BigInteger.valueOf(sequenceNumber));
        return factorial;
    }

    private static int findNumberDigitsSum(BigInteger numberFactorial) {
        String numericString = numberFactorial.toString();
        int digitsSum = 0;
        for (int digitIndex = 0; digitIndex < numericString.length(); digitIndex++) {
            digitsSum += Character.getNumericValue(numericString.charAt(digitIndex));
        }
        return digitsSum;
    }
}