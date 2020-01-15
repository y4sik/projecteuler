package starship.task5;

public class TaskRunner {

    private static final int FROM = 1;
    private static final int TO = 20;

    /**
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
     * <p>
     * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    public static void main(String[] args) {
        Multiple multiple = Multiple.getInstance();
        System.out.println(multiple.findSmallestNumberDividedByNumbersInRange(FROM, TO));
    }
}
