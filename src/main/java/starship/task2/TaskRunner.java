package starship.task2;

public class TaskRunner {
    private static final int LIMIT = 4_000_000;

    public static void main(String[] args) {
        System.out.println(Fibonacci.findSumEvenFibonacciNumbers(LIMIT));
    }
}
