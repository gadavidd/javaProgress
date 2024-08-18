package materials.src.main.java.org.example.course.Model9.entities;


public class BankAccount {
	private int numberAccount;
	private String nameHolder;
	private double balanceValue;
	private double TAX = 5.00;
	
	public BankAccount(int numberAccount, String nameHolder, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.nameHolder  = nameHolder;
		depositValue(initialDeposit);
	}
	
	public BankAccount(int numberAccount, String nameHolder) {
		this.numberAccount = numberAccount;
		this.nameHolder  = nameHolder;
	}
	
	public void setName(String newName) {
		this.nameHolder = newName;
	}
	
	public String getName() {
		return nameHolder;
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public double getbalance() {
		return balanceValue;
	}
			
	public void depositValue(double amount) {
		balanceValue += amount;
	}
	
	public void withdrawValue(double withdraw) {
		balanceValue -= (withdraw + TAX);
	}
		
	public String toString() {
		return "Account " + numberAccount 
				+ ", Holder " + nameHolder 
				+ ", Balance: $ " + String.format("%.2f", balanceValue);
	}
}

	

