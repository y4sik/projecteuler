package starship.task13;

import java.math.BigInteger;

class LargeAdder {

    private static LargeAdder instance;

    private LargeAdder() {
    }

    static LargeAdder getInstance() {
        if (instance == null) {
            instance = new LargeAdder();
        }
        return instance;
    }

    /**
     * Finds the sum of large numbers.
     *
     * @param numbersArray the array of large numbers
     * @return first n digits of the sum
     */
    String getFirstDigitsOfNumbersSum(String[] numbersArray, int countDigits) {
        BigInteger numbersSum = BigInteger.ZERO;
        for (String numberFromArray : numbersArray)
            numbersSum = numbersSum.add(new BigInteger(numberFromArray));
        return numbersSum.toString().substring(0, countDigits);
    }
}
