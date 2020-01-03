package starship.task9;

public class PythagoreanTriplet {

    /**
     * A Pythagorean triplet is a set of three natural numbers,
     * a < b < c, for which, a^2 + b^2 = c^2
     *
     * @param number a number for which equality holds: number = a + b + c,
     *               where c^2 = a^2 + b^2
     * @return product of Pythagorean triplet or -1 if does not exist
     */
    public static Integer findPythagoreanTripletProduct(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number must be greatest than zero.");
        }
        for (int numberA = 1; numberA < number; numberA++) {
            for (int numberB = numberA + 1; numberB < number; numberB++) {
                int numberC = number - (numberA + numberB);
                if (numberA * numberA + numberB * numberB == numberC * numberC) {
                    return numberA * numberB * numberC;
                }
            }
        }
        return null;
    }
}
