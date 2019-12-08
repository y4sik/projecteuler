package starship.task7;

public class Task7 {

    public static int firstPrime(int limit) {
        int count = 0;
        int i = 0;
        while (count < limit) {
            i++;
            if (isPrime(i)) {
                count += 1;
            }
        }
        return i;
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
