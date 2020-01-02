package starship.task9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTripletTest {

    private static HashMap<Integer, Integer> ordinalPrimeMap = new HashMap<>();
    private static int[] testNumbers = new int[6];

    @BeforeAll
    static void setUp() {
        ordinalPrimeMap.put(1000, 31875000);
        ordinalPrimeMap.put(10_000, 1810228928);
        ordinalPrimeMap.put(100, null);
        ordinalPrimeMap.put(25, null);
        testNumbers[0] = 1000;
        testNumbers[1] = 10_000;
        testNumbers[2] = 100;
        testNumbers[3] = 25;
        testNumbers[4] = -1;
        testNumbers[5] = -5;
    }


    @Test
    void findPythagoreanTripletProduct() {
        Integer expected = PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[0]);
        Integer actual = ordinalPrimeMap.get(testNumbers[0]);

        assertEquals(expected, actual);

        expected = PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[1]);
        actual = ordinalPrimeMap.get(testNumbers[1]);

        assertEquals(expected, actual);

    }

    @Test
    void findPythagoreanTripletProductNotExist() {
        Integer expected = PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[2]);
        Integer actual = ordinalPrimeMap.get(testNumbers[2]);

        assertEquals(expected, actual);

        expected = PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[3]);
        actual = ordinalPrimeMap.get(testNumbers[3]);

        assertEquals(expected, actual);
    }

    @Test
    void findPythagoreanTripletProductIllegalArguments() {
        assertThrows(IllegalArgumentException.class, () -> PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[4]));
        assertThrows(IllegalArgumentException.class, () -> PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[5]));
    }
}