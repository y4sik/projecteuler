package starship.task7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PrimeManagerTest {

    private static HashMap<Integer, Integer> ordinalPrimeMap = new HashMap<>();
    private static int[] testNumbers;

    @BeforeAll
    static void setUp() {
        testNumbers = new int[]{1, 3, 5, 0, -1, -5};
        ordinalPrimeMap.put(testNumbers[0], 2);
        ordinalPrimeMap.put(testNumbers[1], 5);
        ordinalPrimeMap.put(testNumbers[2], 11);
        ordinalPrimeMap.put(testNumbers[3], 0);
    }

    @Test
    void findPrimeByOrdinalNumber() {
        int expected = PrimeManager.findPrimeByOrdinalNumber(testNumbers[0]);
        int actual = ordinalPrimeMap.get(testNumbers[0]);

        assertEquals(expected, actual);

        expected = PrimeManager.findPrimeByOrdinalNumber(testNumbers[1]);
        actual = ordinalPrimeMap.get(testNumbers[1]);

        assertEquals(expected, actual);

        expected = PrimeManager.findPrimeByOrdinalNumber(testNumbers[2]);
        actual = ordinalPrimeMap.get(testNumbers[2]);

        assertEquals(expected, actual);
    }

    @Test
    void findPrimeByOrdinalNumberBoundaryValues() {
        int expected = PrimeManager.findPrimeByOrdinalNumber(testNumbers[3]);
        int actual = ordinalPrimeMap.get(testNumbers[3]);
        assertEquals(expected, actual);
    }

    @Test
    void findPrimeByOrdinalNumberIllegalArguments() {
        assertThrows(IllegalArgumentException.class, () -> PrimeManager.findPrimeByOrdinalNumber(testNumbers[4]));
        assertThrows(IllegalArgumentException.class, () -> PrimeManager.findPrimeByOrdinalNumber(testNumbers[5]));
    }
}