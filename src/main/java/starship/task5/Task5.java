package starship.task5;

public class Task5 {
    public static long LCM(long a, long b) {
        return a * b / GCD(a, b);
    }

    public static long GCD(long a, long b) {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Negative number");
        while (b != 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static long smallestMultiple(int from, int to) {
        long lcm = 1;
        for (int i = from; i <= to; i++) {
            lcm = LCM(i, lcm);
            System.out.println(lcm);
        }
        return lcm;
    }
}