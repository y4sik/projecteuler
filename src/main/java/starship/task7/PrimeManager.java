package starship.task7;

public class PrimeManager {

    /**
     * Finds n-th prime number (n > 0).
     *
     * @param ordinalNumber the ordinal number on which the prime number is searched
     * @return n-th prime number
     */
    public static int findOrdinalNumberOfPrime(int ordinalNumber) {
        if (ordinalNumber < 0) {
            throw new IllegalArgumentException("Negative ordinal number");
        }
        int count = 0;
        int i = 0;
        while (count < ordinalNumber) {
            i++;
            if (isPrime(i)) {
                count += 1;
            }
        }
        return i;
    }

    /**
     * Check if number is prime number
     *
     * @param number the number to be tested on prime
     * @return true if number is prime
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
