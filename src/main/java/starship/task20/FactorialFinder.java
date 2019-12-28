package starship.task20;

import java.math.BigInteger;
import java.util.HashMap;

public class FactorialFinder {

    private HashMap<Integer, BigInteger> numbersFactorialCache = new HashMap<>();

    private int DISTANCE_BETWEEN_NUMBERS_IN_CACHE = 10;

    private int COUNT_ADJACENT_NUMBERS_TO_CHECK = 1000;

    /**
     * Finds the sum of digits of a number after finding the factorial of that number.
     *
     * @param number the number from which the factorial will be found
     * @return sum of digits of a factorial number
     */
    public int findDigitsSumFromNumberFactorial(int number) {
        BigInteger numberFactorial = getNumberFactorialFromCache(number);
        if (numberFactorial.equals(BigInteger.valueOf(-1))) {
            numberFactorial = factorial(number);
            addNumberToCache(number, numberFactorial);
        }
        return findNumberDigitsSum(numberFactorial);
    }

    private BigInteger getNumberFactorialFromCache(int number) {
        if (numbersFactorialCache.containsKey(number)) {
            return numbersFactorialCache.get(number);
        }
        int roundedNumber = normalizeNumber(number);
        if (numbersFactorialCache.containsKey(roundedNumber)) {
            return getFactorialFromCurrentCacheNumber(number, roundedNumber, numbersFactorialCache.get(roundedNumber));
        }
        for (int distanceMultiplier = 1; distanceMultiplier <= COUNT_ADJACENT_NUMBERS_TO_CHECK; distanceMultiplier++) {
            int nextCacheNumber = roundedNumber + DISTANCE_BETWEEN_NUMBERS_IN_CACHE * distanceMultiplier;
            int previousCacheNumber = roundedNumber - DISTANCE_BETWEEN_NUMBERS_IN_CACHE * distanceMultiplier;
            if (previousCacheNumber <= 0) {
                return BigInteger.valueOf(-1);
            }
            if (numbersFactorialCache.containsKey(nextCacheNumber)) {
                return getFactorialFromNextCacheNumber(number, nextCacheNumber,
                        numbersFactorialCache.get(nextCacheNumber));
            }
            if (numbersFactorialCache.containsKey(previousCacheNumber)) {
                return getFactorialFromPreviousCacheNumber(number, previousCacheNumber,
                        numbersFactorialCache.get(previousCacheNumber));
            }
        }
        return BigInteger.valueOf(-1);
    }

    private int normalizeNumber(int number) {
        return (int) Math.round((double) number / DISTANCE_BETWEEN_NUMBERS_IN_CACHE)
                * DISTANCE_BETWEEN_NUMBERS_IN_CACHE;
    }

    private BigInteger getFactorialFromCurrentCacheNumber(int number, int currentCacheNumber, BigInteger numberFactorial) {
        if (currentCacheNumber > number) {
            return getFactorialFromNextCacheNumber(number, currentCacheNumber, numberFactorial);
        }
        return getFactorialFromPreviousCacheNumber(number, currentCacheNumber, numberFactorial);
    }

    private BigInteger getFactorialFromNextCacheNumber(int number, int nextNumberInCache, BigInteger numberFactorial) {
        for (int currentNumber = nextNumberInCache; currentNumber > number; currentNumber--) {
            numberFactorial = numberFactorial.divide(BigInteger.valueOf(currentNumber));
            if ((currentNumber - 1) % DISTANCE_BETWEEN_NUMBERS_IN_CACHE == 0) {
                addNumberToCache(currentNumber - 1, numberFactorial);
            }
        }
        return numberFactorial;
    }

    private BigInteger getFactorialFromPreviousCacheNumber(int number, int previousNumberInCache, BigInteger numberFactorial) {
        for (int currentNumber = previousNumberInCache + 1; currentNumber <= number; currentNumber++) {
            numberFactorial = numberFactorial.multiply(BigInteger.valueOf(currentNumber));
            if (currentNumber % DISTANCE_BETWEEN_NUMBERS_IN_CACHE == 0) {
                addNumberToCache(currentNumber, numberFactorial);
            }
        }
        return numberFactorial;
    }

    private void addNumberToCache(int number, BigInteger numberFactorial) {
        int roundedNumber = normalizeNumber(number);
        if (roundedNumber == number) {
            numbersFactorialCache.put(roundedNumber, numberFactorial);
        }
    }

    /**
     * Finds the factorial of a number.
     *
     * @param number the number for which factorial is calculated
     * @return factorial of number
     */
    private BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int sequenceNumber = 2; sequenceNumber <= number; sequenceNumber++){
            factorial = factorial.multiply(BigInteger.valueOf(sequenceNumber));
            if (sequenceNumber % DISTANCE_BETWEEN_NUMBERS_IN_CACHE == 0) {
                addNumberToCache(sequenceNumber, factorial);
            }
        }

        return factorial;
    }

    private int findNumberDigitsSum(BigInteger numberFactorial) {
        String numericString = numberFactorial.toString();
        int digitsSum = 0;
        for (int digitIndex = 0; digitIndex < numericString.length(); digitIndex++) {
            digitsSum += Character.getNumericValue(numericString.charAt(digitIndex));
        }
        return digitsSum;
    }

    public HashMap<Integer, BigInteger> getNumbersFactorialCache() {
        return numbersFactorialCache;
    }
}