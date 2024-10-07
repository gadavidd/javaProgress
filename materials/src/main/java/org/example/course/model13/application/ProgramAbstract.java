package materials.src.main.java.org.example.course.model13.application;

import materials.src.main.java.org.example.course.model13.entities.abstrac.AccountAbstract;
import materials.src.main.java.org.example.course.model13.entities.abstrac.BusinessAccountAbstract;
import materials.src.main.java.org.example.course.model13.entities.abstrac.SavingsAccountAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramAbstract {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<AccountAbstract> list = new ArrayList<>();

        list.add(new SavingsAccountAbstract(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccountAbstract(1002, "Maria", 1000.00, 400.0));
        list.add(new SavingsAccountAbstract(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccountAbstract(1005, "Anna", 500.00, 500.00));

        double sum = 0.0;
        for (AccountAbstract acc: list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for(AccountAbstract acc: list){
            acc.deposit(10.0);
        }

        for(AccountAbstract acc: list){
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
