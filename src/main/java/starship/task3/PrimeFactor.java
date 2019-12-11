package starship.task3;

import java.util.ArrayList;
import java.util.List;

class PrimeFactor {
    /**
     * Decomposes a number into prime factors
     *
     * @param number will decomposes into prime factors
     * @return the list of primes
     */
    static List<Long> findPrimeFactors(long number) {
        List<Long> primeFactorList = new ArrayList<>();
        while (true) {
            long smallestFactor = findSmallestPrimeFactor(number);
            if (smallestFactor < number) {
                number /= smallestFactor;
                primeFactorList.add(smallestFactor);
            } else {
                primeFactorList.add(smallestFactor);
                return primeFactorList;
            }
        }
    }

    private static long findSmallestPrimeFactor(long n) {
        long end = (long) Math.ceil(Math.sqrt(n));
        for (long i = 2; i <= end; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
