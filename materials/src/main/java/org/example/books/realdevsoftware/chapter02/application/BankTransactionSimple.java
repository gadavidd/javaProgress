package materials.src.main.java.org.example.books.realdevsoftware.chapter02.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionSimple {
    public static void main(final String...args) throws IOException{
        final Path path = Paths.get("materials/src/main/resources/bank-data-simple.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;

        final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        double totalMonth = 0d;

        for(final String line: lines){
            final String [] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            final LocalDate date = LocalDate.parse(columns[0],DATE_PATTERN);

            if(date.getMonth() == Month.JANUARY){
                totalMonth += amount;
            }
            total += amount;
        }

        System.out.println("The total for all transaction is " + total);
        System.out.println("The total for all transaction in January is " + totalMonth);
    }
}
