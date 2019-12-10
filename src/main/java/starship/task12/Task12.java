package starship.task12;

public class Task12 {
    public static int highlyDivisibleTriangularNumber(int divisorsCount) {
        int triangleNumber = 0;
        for (int i = 0; ; i++) {
            triangleNumber += i;
            if (findAllDivisors(triangleNumber) > divisorsCount) {
                return triangleNumber;
            }
        }
    }

    private static int findAllDivisors(int number) {
        int count = 0;
        int end = (int) Math.ceil(Math.sqrt(number));
        for (int i = 1; i < end; i++) {
            if (number % i == 0) {
                count += 2;
            }
        }
        return count;
    }
}
