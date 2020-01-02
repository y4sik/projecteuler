package starship.task8;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LargeNumberManagerTest {
    private String[] numericString;
    private List<LargeNumberManagerData> data = new ArrayList<>();

    @BeforeClass
    public void setUp() {
        numericString = new String[]{
                "12345",
                "543210",
                "000",
                "34",
                "-123",
                "5",
                "54-3210",
                "123a45",
                "a12345",
                "letters",
                ""
        };

        data.add(new LargeNumberManagerData(2, numericString[0], 20));
        data.add(new LargeNumberManagerData(3, numericString[1], 60));
        data.add(new LargeNumberManagerData(2, numericString[2], 0));
        data.add(new LargeNumberManagerData(2, numericString[3], 12));
        data.add(new LargeNumberManagerData(2, numericString[4], 6));
        data.add(new LargeNumberManagerData(3, numericString[4], -6));
        data.add(new LargeNumberManagerData(1, numericString[5], 5));
    }

    @Test
    public void testLargestProductInSeries() {
        long actual = data.get(0).getActual();
        long expected = LargeNumberManager.largestProductInSeries(data.get(0).getCountAdjacentNumbers(),
                data.get(0).getNumericString());

        assertEquals(actual, expected);

        actual = data.get(1).getActual();
        expected = LargeNumberManager.largestProductInSeries(data.get(1).getCountAdjacentNumbers(),
                data.get(1).getNumericString());
        assertEquals(actual, expected);

        actual = data.get(2).getActual();
        expected = LargeNumberManager.largestProductInSeries(data.get(2).getCountAdjacentNumbers(),
                data.get(2).getNumericString());
        assertEquals(actual, expected);

        actual = data.get(3).getActual();
        expected = LargeNumberManager.largestProductInSeries(data.get(3).getCountAdjacentNumbers(),
                data.get(3).getNumericString());
        assertEquals(actual, expected);

        actual = data.get(4).getActual();
        expected = LargeNumberManager.largestProductInSeries(data.get(4).getCountAdjacentNumbers(),
                data.get(4).getNumericString());
        assertEquals(actual, expected);

        actual = data.get(5).getActual();
        expected = LargeNumberManager.largestProductInSeries(data.get(5).getCountAdjacentNumbers(),
                data.get(5).getNumericString());
        assertEquals(actual, expected);

        actual = data.get(6).getActual();
        expected = LargeNumberManager.largestProductInSeries(data.get(6).getCountAdjacentNumbers(),
                data.get(6).getNumericString());
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testLargestProductInSeriesIllegalArguments() {
        LargeNumberManager.largestProductInSeries(numericString[0].length(), numericString[0]);
        LargeNumberManager.largestProductInSeries(getRandomNumber(numericString[0].length(), 20), numericString[0]);
        LargeNumberManager.largestProductInSeries(-getRandomNumber(1, 20), numericString[0]);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testLargestProductInSeriesNotNumericString() {
        LargeNumberManager.largestProductInSeries(getRandomNumber(1, numericString[6].length()), numericString[6]);
        LargeNumberManager.largestProductInSeries(getRandomNumber(1, numericString[7].length()), numericString[7]);
        LargeNumberManager.largestProductInSeries(getRandomNumber(1, numericString[8].length()), numericString[8]);
        LargeNumberManager.largestProductInSeries(getRandomNumber(1, numericString[9].length()), numericString[9]);
        LargeNumberManager.largestProductInSeries(getRandomNumber(1, numericString[10].length()), numericString[10]);
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

}