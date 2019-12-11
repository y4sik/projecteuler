package starship.task9;

public class PythagoreanTriplet {

    /**
     * A Pythagorean triplet is a set of three natural numbers,
     * a < b < c, for which, a^2 + b^2 = c^2
     *
     * @param number a number for which equality holds: number = a + b + c,
     *               where c^2 = a^2 + b^2
     * @return product of Pythagorean triplet
     */
    public static int findPythagoreanTripletProduct(int number) {
        for (int a = 1; a < number; a++) {
            for (int b = a + 1; b < number; b++) {
                int c = number - a - b;
                if (a * a + b * b == c * c) {
                    return a * b * c;
                }
            }
        }
        return -1;
    }
}
