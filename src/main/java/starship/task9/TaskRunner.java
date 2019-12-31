package starship.task9;

public class TaskRunner {

    private static final int NUMBER = 1000;

    /**
     * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
     * <p>
     * a2 + b2 = c2
     * For example, 32 + 42 = 9 + 16 = 25 = 52.
     * <p>
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product abc.
     */

    public static void main(String[] args) {
        System.out.println(PythagoreanTriplet.findPythagoreanTripletProduct(NUMBER));
    }
}
