package starship.task19;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TaskRunner {

    private static final LocalDate START_DATE = LocalDate.of(1901, 1, 1);
    private static final LocalDate END_DATE = LocalDate.of(2000, 12, 31);
    private static final int MONTH_DAY = 1;
    private static final DayOfWeek WEEK_DAY = DayOfWeek.SUNDAY;

    /**
     * You are given the following information, but you may prefer to do some research for yourself.
     * <p>
     * 1 Jan 1900 was a Monday.
     * Thirty days has September,
     * April, June and November.
     * All the rest have thirty-one,
     * Saving February alone,
     * Which has twenty-eight, rain or shine.
     * And on leap years, twenty-nine.
     * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
     * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
     */
    public static void main(String[] args) {
        System.out.println(DateCounter.weekDayCount(START_DATE, END_DATE, MONTH_DAY, WEEK_DAY));
    }
}
