package starship.task1;

public class Multiple {
    /**
     * Find the sum of all the numbers below limit, that are multiple to elements in arr
     *
     * @param arr   elements to test for multiplicity
     * @param limit the restriction for finding multiples
     * @return the sum of all the multiples elements
     */
    public static int findMultiples(int limit, int... arr) {
        int sum = 0;
        for (int i = 1; i < limit; i++) {
            for (int value : arr) {
                if (i % value == 0) {
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }
}
