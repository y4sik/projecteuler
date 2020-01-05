package starship.task21;

public class TaskRunner {

    private static final int MAX_NUMBER = 10_000;

    /**
     * Let d(n) be defined as the sum of proper divisors of n
     * (numbers less than n which divide evenly into n).
     * If d(a) = b and d(b) = a, where a ≠ b, then a and b are
     * an amicable pair and each of a and b are called amicable numbers.
     * <p>
     * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110;
     * therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
     * <p>
     * Evaluate the sum of all the amicable numbers under 10000.
     */
    public static void main(String[] args) {
        System.out.println(AmicableFinder.sumOfAmicable(MAX_NUMBER));
    }
}
