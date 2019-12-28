package starship.task20;

public class TaskRunner {

    private static final int MAX_NUMBER = 1000;

    private static final int ITERATIONS_COUNT = 50;

    public static void main(String[] args) {

        long totalAlgorithmRunningTime = 0;

        for (int algorithmExecution = 0; algorithmExecution < ITERATIONS_COUNT; algorithmExecution++) {
            FactorialFinder factorialFinder = new FactorialFinder();
            long algorithmStartTime = System.nanoTime();
            for (int iteration = 1; iteration < 1000; iteration++) {
                int number = getRandomNumber(1, MAX_NUMBER);
                factorialFinder.findDigitsSumFromNumberFactorial(number);
            }
            long algorithmEndTime = System.nanoTime();
            totalAlgorithmRunningTime += algorithmEndTime - algorithmStartTime;
        }
        long averageAlgorithmRunningTime = totalAlgorithmRunningTime / ITERATIONS_COUNT;
        System.out.println(String.format("Nanoseconds: %d", averageAlgorithmRunningTime));
        System.out.println(String.format("Milliseconds: %d", averageAlgorithmRunningTime / 1_000_000));
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }
}
