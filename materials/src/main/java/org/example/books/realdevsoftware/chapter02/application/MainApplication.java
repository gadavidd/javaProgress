package materials.src.main.java.org.example.books.realdevsoftware.chapter02.application;

import materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities.BankStatementCSVParser;
import materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities.BankStatementParser;

import java.io.IOException;

public class MainApplication {

    private static final String RESOURCES = "materials/src/main/resources/bank-data-simple.csv";
    public static void main(final String ... args) throws IOException{
        final BankTransactionClass bankTransactionClass = new BankTransactionClass();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankTransactionClass.analyze(RESOURCES, bankStatementParser);
    }
}
