package starship.task10;

public class TaskRunner {
    private static final int LIMIT = 2_000_000;

    public static void main(String[] args) {
        System.out.println(PrimeManager.findSumOfPrimes(LIMIT));
    }
}
