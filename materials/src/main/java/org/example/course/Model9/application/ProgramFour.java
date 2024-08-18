package materials.src.main.java.org.example.course.Model9.application;

import materials.src.main.java.org.example.course.Model9.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFour {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount bankAccount;
		double value = 0;
		char response;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nameHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n): ");
		response = sc.next().charAt(0);
		
		while (response != 'n' && response != 'y') {
			System.out.print("Is there an initial deposit (y/n): ");
			response = sc.next().charAt(0);
		}
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			bankAccount = new BankAccount(numberAccount, nameHolder, value);
		} else {
			bankAccount = new BankAccount(numberAccount, nameHolder);
		}
				
		System.out.println("Account data:");
		System.out.println(bankAccount.toString());
		
		System.out.print("Enter a deposit value: ");
		bankAccount.depositValue(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.println(bankAccount.toString());
		
		System.out.print("Enter a withdraw value: ");
		bankAccount.withdrawValue(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.println(bankAccount.toString());
		
		sc.close();
	}

}
