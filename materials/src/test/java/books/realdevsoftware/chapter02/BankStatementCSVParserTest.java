package materials.src.test.java.books.realdevsoftware.chapter02;

import materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities.BankStatementCSVParser;
import materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities.BankStatementParser;
import materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities.BankTransaction;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class BankStatementCSVParserTest {
    private final BankStatementParser statementParser = new BankStatementCSVParser();

    @Test
    public void shouldParseOneCorrectLine() throws Exception{
        final String line = "30-01-2017, -50,Tesco";

        final BankTransaction result = statementParser.parseFrom(line);

        final BankTransaction expected = new BankTransaction(LocalDate.of(2017, Month.JANUARY, 30), -50, "Tesco");
        final double tolerance = 0.0d;

        Assert.assertEquals(expected.getDate(), result.getDate());
        Assert.assertEquals(expected.getAmount(), result.getAmount(), tolerance);
        Assert.assertEquals(expected.getDescription(), result.getDescription());
    }
}
