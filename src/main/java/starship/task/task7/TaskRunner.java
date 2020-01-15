package starship.task.task7;

public class TaskRunner {
    private static final int NUMBER_OF_PRIME = 10_001;

    /**
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     * <p>
     * What is the 10 001st prime number?
     */

    public static void main(String[] args) {
        System.out.println(PrimeManager.findPrimeByOrdinalNumber(NUMBER_OF_PRIME));
    }
}
