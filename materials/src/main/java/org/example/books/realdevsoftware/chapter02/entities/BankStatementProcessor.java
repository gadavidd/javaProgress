package materials.src.main.java.org.example.books.realdevsoftware.chapter02.entities;

import java.time.Month;
import java.util.List;

public class BankStatementProcessor {
    private final List<BankTransaction> bankTransactionList;

    public BankStatementProcessor(final List <BankTransaction> bankTransactions){
        this.bankTransactionList = bankTransactions;
    }

    public double calculateTotalAmount(){
        double total = 0d;
        for(final BankTransaction bankTransaction: bankTransactionList){
            total += bankTransaction.getAmount();
        }
        return total;
    }

    public double calculateTotalInMonth(final Month month){
        double total = 0d;
        for(final BankTransaction bankTransaction: bankTransactionList){
            if(bankTransaction.getDate().getMonth() == month){
                total += bankTransaction.getAmount();
            }
        }
        return total;
    }

    public double calculateTotalForCategory(final String category){
        double total = 0d;
        for(final BankTransaction bankTransaction : bankTransactionList){
            if(bankTransaction.getDescription().equals(category)){
                total += bankTransaction.getAmount();
            }
        }
        return total;
    }
}
