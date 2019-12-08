package starship.task3;

import java.util.List;

public class TaskRunner {
    private static final long NUMBER = 600_851_475_143L;

    public static void main(String[] args) {
        List<Long> primeFactorList = Task3.findPrimeFactors(NUMBER);
        System.out.println(primeFactorList.get(primeFactorList.size() - 1));
    }
}
