package materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);

}
