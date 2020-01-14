package starship.task2;

class Fibonacci {

    private static Fibonacci instance;

    private Fibonacci() {
    }

    static Fibonacci getInstance() {
        if (instance == null) {
            instance = new Fibonacci();
        }
        return instance;
    }

    /**
     * Find the sum of even Fibonacci numbers, below limit.
     *
     * @param limit the restriction for finding fibonacci numbers
     * @return sum of even Fibonacci numbers
     */
    int findSumEvenFibonacciNumbers(int limit) {
        int sum = 0;
        int fib1 = 1;
        int fib2 = 2;
        while (fib1 < limit) {
            if (fib1 % 2 == 0) {
                sum += fib1;
            }
            int fibN = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibN;
        }
        return sum;
    }
}
