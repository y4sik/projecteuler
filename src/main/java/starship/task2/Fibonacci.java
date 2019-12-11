package starship.task2;

public class Fibonacci {

    /**
     * Find the sum of even Fibonacci numbers, below limit
     *
     * @param limit the restriction for finding fibonacci numbers
     * @return sum of even Fibonacci numbers
     */
    public static int findEvenSumOfEvenFibonacciNumbers(int limit) {
        int sum = 0;
        int f1 = 1;
        int f2 = 2;
        while (f1 < limit) {
            if (f1 % 2 == 0) {
                sum += f1;
            }
            int fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return sum;
    }
}
