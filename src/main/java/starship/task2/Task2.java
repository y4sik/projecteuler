package starship.task2;

public class Task2 {
    public static int evenFibonacciSum(int limit) {
        int sum = 0;
        int f1 = 1;
        int f2 = 2;
        while (f1 < limit) {
            if (f1 % 2 == 0) {
                sum += f1;
            }
            int fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return sum;
    }
}
