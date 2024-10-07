package materials.src.main.java.org.example.course.model13.application;

import materials.src.main.java.org.example.course.model13.entities.Account;
import materials.src.main.java.org.example.course.model13.entities.BusinessAccount;
import materials.src.main.java.org.example.course.model13.entities.SavingsAccount;

public class ProgramTwo {
    public static void main(String[] args){
        Account account1 = new Account(1001, "Alex", 1000.0);

        account1.withdraw(200.0);
        System.out.println(account1.getBalance());

        Account account2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);

        account2.withdraw(200.0);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);
        account3.withdraw(200.00);
        System.out.println(account3.getBalance());
    }
}
