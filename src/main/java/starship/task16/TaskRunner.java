package starship.task16;

public class TaskRunner {

    private static final int NUMBER = 2;
    private static final int DEGREE = 1000;

    /**
     * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
     * <p>
     * What is the sum of the digits of the number 21000?
     */
    public static void main(String[] args) {
        System.out.println(DigitSum.findDigitSumNumberInDegree(NUMBER, DEGREE));
    }
}
