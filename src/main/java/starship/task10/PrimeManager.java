package starship.task10;

public class PrimeManager {

    /**
     * Find the sum of all the primes below limit
     *
     * @param limit the number to which prime numbers must be found
     * @return sum of primes below limit
     */
    public static long findSumOfPrimes(int limit) {
        long sum = 0;
        for (int i = 0; i < limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
    
    /**
     * Check if number is prime number
     *
     * @param number the number to be tested on prime
     * @return true id number is prime
     */
    private static boolean isPrime(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        if (number == 0 || number == 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            if (number % 2 == 0) {
                return false;
            }
            int end = (int) Math.ceil(Math.sqrt(number));
            for (int i = 3; i <= end; i += 2) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }
}
