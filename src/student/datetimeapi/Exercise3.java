package student.datetimeapi;

import java.time.Year;
import java.time.YearMonth;

public class Exercise3 {
    public static void main(String[] args) {
        /*
        Given a certain year and month, print the dates of all the Thursdays of that month.
        Hint: first use class Year ( atMonth() / atDay() ) in combination with TemporalAdjusters
         to find the date of the first Thursday. Then, use TemporalAdjusters to find the next
         Thursdays of the month as long as the month is the same month.
        */
        var yearMonth = YearMonth.of(2000, 10);
        var year = Year.of(yearMonth.getYear());
        var month = yearMonth.getMonth();
    }


}
