package starship.task3;

import java.util.ArrayList;
import java.util.List;

class PrimeFactor {

    private static PrimeFactor instance;

    private PrimeFactor() {
    }

    static PrimeFactor getInstance() {
        if (instance == null) {
            instance = new PrimeFactor();
        }
        return instance;
    }

    /**
     * Decomposes a number into prime factors.
     *
     * @param number will decomposes into prime factors
     * @return the list of primes
     */
    List<Long> findPrimeFactors(long number) {
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
    private long findSmallestPrimeFactor(long number) {
        long end = (long) Math.ceil(Math.sqrt(number));
        for (long currentNumber = 2; currentNumber <= end; currentNumber++) {
            if (number % currentNumber == 0) {
                return currentNumber;
            }
        }
        return number;
    }
}
