package starship.task16;

import java.math.BigInteger;

public class DigitSum {
    /**
     * Find sum of digits of number in a degree.
     *
     * @param number the number raised to a degree
     * @param numberDegree the degree to which the number is raised
     * @return sum of digits of number in a degree
     */
    public static int findDigitSumNumberInDegree(int number, int numberDegree) {
        String numericString = BigInteger.valueOf(number).pow(numberDegree).toString();
        int digitSum = 0;
        for (int digitIndex = 0; digitIndex < numericString.length(); digitIndex++) {
            digitSum += Character.getNumericValue(numericString.charAt(digitIndex));
        }
        return digitSum;
    }
}
