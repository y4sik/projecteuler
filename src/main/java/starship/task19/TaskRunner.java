package starship.task19;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TaskRunner {

    private static final LocalDate START_DATE = LocalDate.of(1901, 1, 1);
    private static final LocalDate END_DATE = LocalDate.of(2000, 12, 31);
    private static final int MONTH_DAY = 1;
    private static final DayOfWeek WEEK_DAY = DayOfWeek.SUNDAY;

    public static void main(String[] args) {
        System.out.println(DateCounter.countSundays(START_DATE, END_DATE, MONTH_DAY, WEEK_DAY));
    }
}
