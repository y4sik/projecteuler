package starship.task10;

public class PrimeManager {

    /**
     * Find the sum of all the primes below limit
     *
     * @param limit the number to which prime numbers must be found
     * @return sum of primes below limit
     */
    public static long findSumPrimes(int limit) {
        long sum = 0;
        for (int index = 0; index < limit; index++) {
            if (isPrime(index)) {
                sum += index;
            }
        }
        return sum;
    }

    /**
     * Check if number is prime number
     *
     * @param number the number to be tested on prime
     * @return true if number is prime
     */
    private static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number < 0 || number == 1 || number % 2 == 0) {
            return false;
        }
        int end = (int) Math.ceil(Math.sqrt(number));
        for (int index = 3; index <= end; index += 2) {
            if (number % index == 0)
                return false;
        }
        return true;
    }
}