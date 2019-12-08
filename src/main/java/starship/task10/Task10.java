package starship.task10;

public class Task10 {

    public static long sumPrimes(int limit) {
        long sum = 0;
        for (int i = 0; i < limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        if (number == 0 || number == 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            if (number % 2 == 0) {
                return false;
            }
            int end = (int) Math.ceil(Math.sqrt(number));
            for (int i = 3; i <= end; i += 2) {
                if (number % i == 0)
                    return false;
            }
            return true;
        }
    }
}
