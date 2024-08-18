package materials.src.main.java.org.example.course.Model11;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ProgramDateTwo {
    //Date and Time to text - ISO8601
    public static void main(String[] args){
        LocalDate d01 = LocalDate.parse("2022-07-20");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(d01));

        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("\nd02 = " + d02.format(fmt1));
        System.out.println("d02 = " + d02.format(fmt2));
        System.out.println("d02 = " + fmt3.format(d02));

        //Don't have format
        Instant d03 = Instant.parse("2012-11-23T01:30:26Z");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
//        ZonedDateTime zonedDateTime = d03.atZone(ZoneOffset.of("-03:00"));
        DateTimeFormatter fmt6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneOffset.of("-03:00"));

        System.out.println("\nd03 = " + fmt4.format(d03));
        System.out.println("d03 = " + fmt5.format(d03));
        System.out.println("d03 = " + fmt6.format(d03));
    }
}
