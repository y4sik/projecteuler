package starship.task13;

import java.math.BigInteger;

public class Task13 {
    public static String findLargeSum(String[] numbers) {
        BigInteger sum = BigInteger.ZERO;
        for (String num : numbers)
            sum = sum.add(new BigInteger(num));
        return sum.toString().substring(0, 10);
    }
}
