package starship.task3;

import java.util.List;

public class TaskRunner {
    private static final long NUMBER = 28;

    public static void main(String[] args) {
        List<Long> primeFactorList = PrimeFactor.findPrimeFactors(NUMBER);
        System.out.println(primeFactorList.get(primeFactorList.size() - 1));
    }
}
