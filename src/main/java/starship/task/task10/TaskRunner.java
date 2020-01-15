package starship.task.task10;

public class TaskRunner {
    private static final int LIMIT_FINDING_PRIMES = 2_000_000;

    /**
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * <p>
     * Find the sum of all the primes below two million.
     */
    public static void main(String[] args) {
        System.out.println(PrimeManager.findSumPrimes(LIMIT_FINDING_PRIMES));
    }
}
