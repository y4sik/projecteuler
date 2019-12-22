package starship.task14;


import java.math.BigInteger;

public class CollatzSequence {
    /**
     * Finds number that produces the longest Collatz sequence.
     * The Collatz iterative sequence is defined for the set of positive integers:
     * <p>
     * n → n/2 (n is even)
     * n → 3n + 1 (n is odd)
     * The last number in sequence is 1.
     *
     * @param maxNumberForFindingChain limit to find the number that gives the longest sequence
     * @return number that produces the longest sequence
     */
    public static int findLongestCollatzSequence(int maxNumberForFindingChain) {
        int maxCountNumbersInChain = -1;
        int number = -1;
        for (int currentNumber = 13; currentNumber < maxNumberForFindingChain; currentNumber++) {
            int countNumbersInChain = findChainLength(currentNumber);
            if (maxCountNumbersInChain < countNumbersInChain) {
                maxCountNumbersInChain = countNumbersInChain;
                number = currentNumber;
            }
        }
        return number;
    }

    /**
     * Finds count numbers in Collatz sequence for given number.
     *
     * @param number the number for which is finding Collatz sequence
     * @return count numbers in chain
     */
    private static int findChainLength(int number) {
        BigInteger bigNumber = BigInteger.valueOf(number);
        int countNumbersInChain = 0;
        while (!bigNumber.equals(BigInteger.ONE)) {
            if (bigNumber.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                bigNumber = bigNumber.divide(BigInteger.valueOf(2));
            } else {
                bigNumber = bigNumber.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            }
            countNumbersInChain++;
        }
        return countNumbersInChain;
    }
}
