package starship.task7;

public class PrimeManager {

    /**
     * Finds n-th prime number (n > 0).
     *
     * @param ordinalPrimeNumber the ordinal number on which the prime number is searched
     * @return n-th prime number
     */
    public static int findPrimeByOrdinalNumber(int ordinalPrimeNumber) {
        int currentOrdinalPrimeNumber = 0;
        int number = 0;
        while (currentOrdinalPrimeNumber < ordinalPrimeNumber) {
            number++;
            if (isPrime(number)) {
                currentOrdinalPrimeNumber += 1;
            }
        }
        return number;
    }

    /**
     * Check if number is prime.
     *
     * @param number the number to be tested on prime
     * @return true if number is prime
     */
    private static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
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