package materials.src.main.java.org.example.course.Model13.entities;

public class SavingsAccountAbstract extends AccountAbstract{
    private double interestRate;

    public SavingsAccountAbstract(){
        super();
    }

    public SavingsAccountAbstract(Integer number, String holder, Double balance, double interestRate){
        super(number,holder,balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance*interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
}
