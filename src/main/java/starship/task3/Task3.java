package starship.task3;

import java.util.ArrayList;
import java.util.List;

class Task3 {
    static List<Long> findPrimeFactors(long number) {
        List<Long> primeFactorList = new ArrayList<>();
        while (true) {
            long smallestFactor = findSmallestFactor(number);
            if (smallestFactor < number) {
                number /= smallestFactor;
                primeFactorList.add(smallestFactor);
            } else {
                primeFactorList.add(smallestFactor);
                return primeFactorList;
            }
        }
    }

    private static long findSmallestFactor(long n) {
        long end = (long) Math.ceil(Math.sqrt(n));
        for (long i = 2; i <= end; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }
}
