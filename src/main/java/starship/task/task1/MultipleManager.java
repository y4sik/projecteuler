package starship.task.task1;

public class MultipleManager {

    /**
     * Find the sum of all the numbers below limit, that are multiple to elements in array.
     *
     * @param array contains elements for checking for multiplicity
     * @param limit the restriction for finding multiples
     * @return the sum of all the multiples elements
     */
    public int findSumNumbersMultipleToArrayElements(int limit, int... array) {
        int sum = 0;
        for (int checkedNumber = 1; checkedNumber < limit; checkedNumber++) {
            for (int value : array) {
                if (checkedNumber % value == 0) {
                    sum += checkedNumber;
                    break;
                }
            }
        }
        return sum;
    }
}
