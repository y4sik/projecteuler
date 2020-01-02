package starship.task9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTripletTest {

    private static HashMap<Integer, Integer> pythagoreanTripletMap = new HashMap<>();
    private static int[] testNumbers = new int[6];

    @BeforeAll
    static void setUp() {
        testNumbers = new int[]{1000, 10_000, 100, 25, -1, -5};
        pythagoreanTripletMap.put(testNumbers[0], 31875000);
        pythagoreanTripletMap.put(testNumbers[1], 1810228928);
        pythagoreanTripletMap.put(testNumbers[2], null);
        pythagoreanTripletMap.put(testNumbers[3], null);

    }

    @Test
    void findPythagoreanTripletProduct() {
        Integer expected = PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[0]);
        Integer actual = pythagoreanTripletMap.get(testNumbers[0]);

        assertEquals(expected, actual);

        expected = PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[1]);
        actual = pythagoreanTripletMap.get(testNumbers[1]);

        assertEquals(expected, actual);
    }

    @Test
    void findPythagoreanTripletProductNotExist() {
        Integer expected = PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[2]);
        Integer actual = pythagoreanTripletMap.get(testNumbers[2]);

        assertEquals(expected, actual);

        expected = PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[3]);
        actual = pythagoreanTripletMap.get(testNumbers[3]);

        assertEquals(expected, actual);
    }

    @Test
    void findPythagoreanTripletProductIllegalArguments() {
        assertThrows(IllegalArgumentException.class,
                () -> PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[4]));
        assertThrows(IllegalArgumentException.class,
                () -> PythagoreanTriplet.findPythagoreanTripletProduct(testNumbers[5]));
    }
}