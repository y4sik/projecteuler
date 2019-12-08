package starship.task6;

public class Task6 {
    public static int sumSquareDifference(int limit) {
        int sumOfSquare = 0;
        int squareOfSum = 0;
        for (int i = 1; i <= limit; i++) {
            sumOfSquare += i * i;
            squareOfSum += i;
        }
        return squareOfSum * squareOfSum - sumOfSquare;
    }
}
