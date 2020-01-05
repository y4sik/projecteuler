package starship.task16;

public class TaskRunner {
    
    /**
     * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
     * <p>
     * What is the sum of the digits of the number 2^1000?
     */
    public static void main(String[] args) {
        int number = 2;
        int numberDegree = 1000;
        System.out.println(DigitSum.findDigitSumNumberInDegree(number, numberDegree));
    }
}
