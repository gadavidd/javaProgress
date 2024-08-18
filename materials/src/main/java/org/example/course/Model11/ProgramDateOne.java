package materials.src.main.java.org.example.course.Model11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramDateOne {
    public static void main(String[] args){
        //Instantiation Date and Time
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //Text to Date and Time
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2012-11-23T09:30:26Z");
        Instant d07 = Instant.parse("2012-11-23T09:30:26-03:00");

        //Custom Formatter
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("01/11/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        LocalDate d10 = LocalDate.parse("01/11/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate d11 = LocalDate.of(2022,7,20);
        LocalDateTime d12 = LocalDateTime.of(2022,7,20,1,24,27);

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
        System.out.println("d12 = " + d12.toString());
    }
}
