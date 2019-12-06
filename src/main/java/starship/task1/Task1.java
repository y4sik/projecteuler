package starship.task1;

public class Task1 {

    public static int findMultiples(int a, int b) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
