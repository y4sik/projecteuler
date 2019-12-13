package starship.task1;

public class MultipleManager {

    /**
     * Find the sum of all the numbers below limit, that are multiple to elements in array.
     *
     * @param array contains elements for checking for multiplicity
     * @param limit the restriction for finding multiples
     * @return the sum of all the multiples elements
     */
    public static int findSumOfNumbersMultipleToArrayElements(int limit, int... array) {
        int sum = 0;
        for (int i = 1; i < limit; i++) {
            for (int value : array) {
                if (i % value == 0) {
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }
}
