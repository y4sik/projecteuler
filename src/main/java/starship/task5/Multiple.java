package starship.task5;

import java.util.ArrayList;

public class Multiple {

    /**
     * Find the smallest positive number that is evenly divisible
     * by all of the numbers in range [from, to]
     *
     * @param from the number from which the multiplicity test begins
     * @param to   the number at which the multiplicity test ends
     * @return smallest multiple
     */
    public static long findSmallestMultiple(int from, int to) {
        long lcm = 1;
        for (int i = from; i <= to; i++) {
            lcm = LCM(i, lcm);
            System.out.println(lcm);
        }
        return lcm;
    }

    private static long LCM(long a, long b) {
        return a * b / GCD(a, b);
    }

    private static long GCD(long a, long b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Negative number");
        while (b != 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}