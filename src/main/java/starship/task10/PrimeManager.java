package starship.task10;

public class PrimeManager {

    /**
     * Find the sum of all the primes below limit
     *
     * @param limitFindingPrimes the number to which prime numbers must be found
     * @return sum of primes below limit
     */
    public static long findSumPrimes(int limitFindingPrimes) {
        long sumPrimes = 0;
        for (int number = 0; number < limitFindingPrimes; number++) {
            if (isPrime(number)) {
                sumPrimes += number;
            }
        }
        return sumPrimes;
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
        int lastDivisor = (int) Math.ceil(Math.sqrt(number));
        for (int divisor = 3; divisor <= lastDivisor; divisor += 2) {
            if (number % divisor == 0)
                return false;
        }
        return true;
    }
}