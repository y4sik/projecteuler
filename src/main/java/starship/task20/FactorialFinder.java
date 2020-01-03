package starship.task20;

import java.math.BigInteger;
import java.util.HashMap;

public class FactorialFinder {

    private HashMap<Integer, BigInteger> numbersFactorialCache = new HashMap<>();

    private int DISTANCE_BETWEEN_CACHE_NUMBERS = 10;

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
        int normalizedNumber = normalizeNumber(number);
        if (numbersFactorialCache.containsKey(normalizedNumber)) {
            return getFactorialFromCurrentCacheNumber(number, normalizedNumber, numbersFactorialCache.get(normalizedNumber));
        }
        for (int distanceMultiplier = 1; distanceMultiplier <= COUNT_ADJACENT_NUMBERS_TO_CHECK; distanceMultiplier++) {
            int nextCacheNumber = normalizedNumber + DISTANCE_BETWEEN_CACHE_NUMBERS * distanceMultiplier;
            int previousCacheNumber = normalizedNumber - DISTANCE_BETWEEN_CACHE_NUMBERS * distanceMultiplier;
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
        return (int) Math.round((double) number / DISTANCE_BETWEEN_CACHE_NUMBERS)
                * DISTANCE_BETWEEN_CACHE_NUMBERS;
    }

    private BigInteger getFactorialFromCurrentCacheNumber(int number, int currentCacheNumber, BigInteger currentCacheNumberFactorial) {
        if (currentCacheNumber > number) {
            return getFactorialFromNextCacheNumber(number, currentCacheNumber, currentCacheNumberFactorial);
        }
        return getFactorialFromPreviousCacheNumber(number, currentCacheNumber, currentCacheNumberFactorial);
    }

    private BigInteger getFactorialFromNextCacheNumber(int number, int nextCacheNumber, BigInteger nextCacheNumberFactorial) {
        for (int currentNumber = nextCacheNumber; currentNumber > number; currentNumber--) {
            nextCacheNumberFactorial = nextCacheNumberFactorial.divide(BigInteger.valueOf(currentNumber));
            if ((currentNumber - 1) % DISTANCE_BETWEEN_CACHE_NUMBERS == 0) {
                addNumberToCache(currentNumber - 1, nextCacheNumberFactorial);
            }
        }
        return nextCacheNumberFactorial;
    }

    private BigInteger getFactorialFromPreviousCacheNumber(int number, int previousCacheNumber, BigInteger previousNumberFactorial) {
        for (int currentNumber = previousCacheNumber + 1; currentNumber <= number; currentNumber++) {
            previousNumberFactorial = previousNumberFactorial.multiply(BigInteger.valueOf(currentNumber));
            if (currentNumber % DISTANCE_BETWEEN_CACHE_NUMBERS == 0) {
                addNumberToCache(currentNumber, previousNumberFactorial);
            }
        }
        return previousNumberFactorial;
    }

    private void addNumberToCache(int number, BigInteger numberFactorial) {
        int normalizedNumber = normalizeNumber(number);
        if (normalizedNumber == number) {
            numbersFactorialCache.put(normalizedNumber, numberFactorial);
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
        for (int sequenceNumber = 2; sequenceNumber <= number; sequenceNumber++) {
            factorial = factorial.multiply(BigInteger.valueOf(sequenceNumber));
            if (sequenceNumber % DISTANCE_BETWEEN_CACHE_NUMBERS == 0) {
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