package student.datetimeapi;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise1 {
    public static void main(String[] args) {
        var instant = Instant.ofEpochSecond(new Random().nextInt(1_000_000_000));
        var randomDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(randomDate);
        //Given the random date, find the date of the previous Thursday
;
    }

}
