package starship.task14;


import java.math.BigInteger;

public class Task14 {
    public static int findLongestCollatzSequence(int limit) {
        int maxCountNumbersInChain = -1;
        int number = -1;
        for (int i = 13; i < limit; i++) {
            int countNumbersInChain = findChainLength(i);
            if (maxCountNumbersInChain < countNumbersInChain) {
                maxCountNumbersInChain = countNumbersInChain;
                number = i;
            }
        }
        return number;
    }

    private static int findChainLength(int number) {
        BigInteger bigNumber = BigInteger.valueOf(number);
        int countNumbersInChain = 0;
        while (!bigNumber.equals(BigInteger.ONE)) {
            if (bigNumber.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                bigNumber = bigNumber.divide(BigInteger.TWO);
            } else {
                bigNumber = bigNumber.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            }
            countNumbersInChain++;
        }
        return countNumbersInChain;
    }
}
