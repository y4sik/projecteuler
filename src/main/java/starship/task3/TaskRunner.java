package starship.task3;

import java.util.List;

public class TaskRunner {
    private static final long NUMBER = 600851475143L;

    /**
     * A palindromic number reads the same both ways. The largest palindrome
     * made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * <p>
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    public static void main(String[] args) {
        List<Long> primeFactorList = PrimeFactor.findPrimeFactors(NUMBER);
        System.out.println(primeFactorList.get(primeFactorList.size() - 1));
    }
}
