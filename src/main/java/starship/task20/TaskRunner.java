package starship.task20;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class TaskRunner {

    private static final Logger LOGGER = LogManager.getLogger(TaskRunner.class);

    private static final int MAX_NUMBER = 1000;

    private static final int ITERATIONS_COUNT = 50;

    public static void main(String[] args) {

        showAlgorithmRunningTime();

        FactorialFinder factorialFinder = new FactorialFinder();
        int number;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            number = in.nextInt();
            if (number < 0) {
                break;
            }
            System.out.println(String.format("Sum digits of factorial: %d", factorialFinder.findDigitsSumFromNumberFactorial(number)));
            System.out.println("Cache: " + factorialFinder.getNumbersFactorialCache());
        } while (true);
    }

    public static void showAlgorithmRunningTime() {
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
        LOGGER.info(String.format("Nanoseconds: %d", averageAlgorithmRunningTime));
        LOGGER.info(String.format("Milliseconds: %d", averageAlgorithmRunningTime / 1_000_000));
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }
}
