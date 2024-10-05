package materials.src.main.java.org.example.course.Model11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProgramDateFour { //Calculate with date and time
    public static void main(String[] args){
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2012-11-23T01:30:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("Past Week d01 = " + pastWeekLocalDate);
        System.out.println("Next Week d01 = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("Past Week d02 = " + pastWeekLocalDateTime);
        System.out.println("Next Week d02 = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("Past Week d03 = " + pastWeekInstant);
        System.out.println("Next Week d03 = " + nextWeekInstant);

        //Duration
        Duration t1 = Duration.between(pastWeekLocalDateTime,d02);
        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0),d01.atTime(0,0));
        Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(),d01.atStartOfDay());
        Duration t4 = Duration.between(d03, pastWeekInstant);

        System.out.println("\nDuration T01 = " + t1.toDays());
        System.out.println("Duration T02 = " + t2.toDays());
        System.out.println("Duration T03 = " + t3.toDays());
        System.out.println("Duration T04 = " + t4.toDays());
    }
}
