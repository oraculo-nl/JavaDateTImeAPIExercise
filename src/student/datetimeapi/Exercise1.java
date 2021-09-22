package student.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        var instant = Instant.ofEpochSecond(new Random().nextInt(1_000_000_000));
        var randomDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(randomDate);
        //Given the random date, find the date of the previous Thursday
        //Hint: use TemporalAdjusters
;
    }

}
