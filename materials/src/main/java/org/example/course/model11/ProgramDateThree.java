package materials.src.main.java.org.example.course.Model11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgramDateThree {
    //Date and Time to text - ISO8601
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2012-11-23T01:30:26Z");

        LocalDate result1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate result2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime result3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime result4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 month = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());

        System.out.println("d02 hour = " + d02.getHour());
        System.out.println("d02 minute = " + d02.getMinute());
    }
}
