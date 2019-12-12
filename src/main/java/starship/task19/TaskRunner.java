package starship.task19;

import java.time.LocalDate;

public class TaskRunner {

    private static final LocalDate START_DATE = LocalDate.of(1901, 1, 1);
    private static final LocalDate END_DATE = LocalDate.of(2000, 12, 31);

    public static void main(String[] args) {
        System.out.println(SundayCounter.countSundays(START_DATE, END_DATE));
    }
}
