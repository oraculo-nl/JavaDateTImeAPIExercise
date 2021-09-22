package student.datetimeapi;

import java.time.LocalDate;

public class Exercise4 {
    public static void main(String[] args) {
        //Given a stream of dates
        // print all the Sundays
        // print only the Sundays that are the 10th day of the month
        var dateStream = LocalDate.of(2021, 1, 1)
                .datesUntil(LocalDate.of(2021, 12, 31));

    }
}
