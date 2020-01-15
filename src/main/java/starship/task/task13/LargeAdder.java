package starship.task.task13;

import java.math.BigInteger;

public class LargeAdder {

    /**
     * Finds the sum of large numbers.
     *
     * @param numbersArray the array of large numbers
     * @return first n digits of the sum
     */
    public static String getFirstDigitsOfNumbersSum(String[] numbersArray, int countDigits) {
        BigInteger numbersSum = BigInteger.ZERO;
        for (String numberFromArray : numbersArray)
            numbersSum = numbersSum.add(new BigInteger(numberFromArray));
        return numbersSum.toString().substring(0, countDigits);
    }
}
