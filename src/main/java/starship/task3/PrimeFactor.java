package starship.task3;

import java.util.ArrayList;
import java.util.List;

class PrimeFactor {

    /**
     * Decomposes a number into prime factors.
     *
     * @param number will decomposes into prime factors
     * @return the list of primes
     */
    static List<Long> findPrimeFactors(long number) {
        List<Long> primeFactorList = new ArrayList<>();
        while (true) {
            long primeFactor = findSmallestPrimeFactor(number);
            if (primeFactor < number) {
                number /= primeFactor;
                primeFactorList.add(primeFactor);
            } else {
                primeFactorList.add(primeFactor);
                return primeFactorList;
            }
        }
    }

    /**
     * Finds the smallest prime factor of a number.
     *
     * @param number the number for which the divisors are search
     * @return prime factor of a number
     */
    private static long findSmallestPrimeFactor(long number) {
        long end = (long) Math.ceil(Math.sqrt(number));
        for (long i = 2; i <= end; i++) {
            if (number % i == 0) {
                return i;
            }
        }
        return number;
    }
}
