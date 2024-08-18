package materials.src.main.java.org.example.course.Model6;

import java.util.Locale;
import java.util.Scanner;

public class whileTest {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char response;
		
		do  {
			System.out.println("Enter the temperature in Celsius :");
			
			double temperatureCelsius = sc.nextDouble();
			double temperatureFahrenheit = 9.0 * temperatureCelsius / 5.0 + 32.0;
			System.out.printf("Fahrenheit equivalent:  %.1f%n", temperatureFahrenheit);
			System.out.println("Do you want to repeat (S/N)? ");
			response = sc.next().charAt(0);
		}
		while (response != 'n');
		sc.close();
	}
}


