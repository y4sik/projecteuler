package starship.task.task3;

import java.util.List;

public class TaskRunner {
    private static final long NUMBER = 600851475143L;

    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     *
     * What is the largest prime factor of the number 600851475143 ?
     */
    public static void main(String[] args) {
        List<Long> primeFactorList = PrimeFactor.findPrimeFactors(NUMBER);
        System.out.println(primeFactorList.get(primeFactorList.size() - 1));
    }
}
