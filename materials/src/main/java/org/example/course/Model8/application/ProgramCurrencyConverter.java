package materials.src.main.java.org.example.course.Model8.application;

import materials.src.main.java.org.example.course.Model8.Utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCurrencyConverter {
	public static void main(String [] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double buy = sc.nextDouble();
		
		double real = CurrencyConverter.dollarsInReais(price, buy);
		
		System.out.printf("Amount to be paid in reais = " + real);		
		
		sc.close();
	}
}
