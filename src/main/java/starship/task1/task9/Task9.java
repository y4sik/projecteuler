package starship.task1.task9;

public class Task9 {
    public static int findPythagoreanTriplet(int sum) {
        for (int a = 1; a < sum; a++) {
            for (int b = a + 1; b < sum; b++) {
                int c = sum - a - b;
                if (a * a + b * b == c * c) {
                    return a * b * c;
                }
            }
        }
        return -1;
    }
}
