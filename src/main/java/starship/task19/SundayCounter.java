package starship.task19;

import java.time.LocalDate;

public class SundayCounter {
    /**
     * Find Sundays fell on the first of the month in range [from, to]
     *
     * @param from year from which the count begins
     * @param to   year on which the count ends
     * @return the number of Sundays that fell on the first of the month in range [from, to]
     */
    public static int countSundays(LocalDate from, LocalDate to) {
        int day = 1;
        int count = 0;
        for (int i = from.getYear(); i < to.getYear(); i++) {
            for (int j = 1; j <= 12; j++) {
                if (LocalDate.of(i, j, day).getDayOfWeek().getValue() == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}