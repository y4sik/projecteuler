package starship.task19;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateCounter {
    /**
     * Find the number of [weekDay] that fell on the [monthDay] in range [startDate, endDate]
     *
     * @param startDate year from which the count begins
     * @param endDate   year on which the count ends
     * @param monthDay  day of the month on which the day of the week falls
     * @param weekDay   day of the week that falls on the day of the month
     * @return the number of [weekDay] that fell on the [monthDay] in range [startDate, endDate]
     */
    public static int countSundays(LocalDate startDate, LocalDate endDate, int monthDay, DayOfWeek weekDay) {
        int numberMatchedDays = 0;
        for (int currentYear = startDate.getYear(); currentYear <= endDate.getYear(); currentYear++) {
            for (int currentMonth = 1; currentMonth <= 12; currentMonth++) {
                if (LocalDate.of(currentYear, currentMonth, monthDay).getDayOfWeek().getValue()
                        == weekDay.getValue()) {
                    numberMatchedDays++;
                }
            }
        }
        return numberMatchedDays;
    }
}