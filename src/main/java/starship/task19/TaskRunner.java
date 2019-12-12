package starship.task19;

import java.time.LocalDate;

public class TaskRunner {

    private static final int STARTING_YEAR = 1901;
    private static final int END_YEAR = 2000;

    public static void main(String[] args) {
        System.out.println(SundayCounter.countSundays(STARTING_YEAR, END_YEAR));
    }
}
