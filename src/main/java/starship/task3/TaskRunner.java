package starship.task3;

import java.util.List;

public class TaskRunner {
    public static void main(String[] args) {
        List<Long> primeFactorList = Task3.largestPrimeFactor(600_851_475_143L);
        System.out.println(primeFactorList.get(primeFactorList.size() - 1));
    }
}
