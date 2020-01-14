package starship.task1;

class MultipleManager {

    private static MultipleManager instance;

    private MultipleManager() {
    }

    static MultipleManager getInstance() {
        if (instance == null) {
            instance = new MultipleManager();
        }
        return instance;
    }

    /**
     * Find the sum of all the numbers below limit, that are multiple to elements in array.
     *
     * @param array contains elements for checking for multiplicity
     * @param limit the restriction for finding multiples
     * @return the sum of all the multiples elements
     */
    int findSumNumbersMultipleToArrayElements(int limit, int... array) {
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
