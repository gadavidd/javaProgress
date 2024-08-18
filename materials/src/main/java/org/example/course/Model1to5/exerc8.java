package materials.src.main.java.org.example.course.Model1to5;//Else-if
import java.util.Locale;
import java.util.Scanner;
public class exerc8{
//Check whether you must pay income tax and the amount

public static void main (String[]args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income R$ :");
		double salaryRombus = sc.nextDouble();
		double taxLisarb = 0;
		
		if(salaryRombus >= 0.00 && salaryRombus <= 2000.00){
			taxLisarb = 0;
		}
		else if(salaryRombus >= 2000.01 && salaryRombus <= 3000.00){
			taxLisarb = (salaryRombus - 2000.00) * 0.08;
		}
		else if(salaryRombus >= 3000.01 && salaryRombus <= 4500.00){
			taxLisarb = 1000.00 * 0.08;
			taxLisarb += (salaryRombus - 3000.00) * 0.18;
		}
		else if(salaryRombus > 4500.00){
			taxLisarb = 1000.00 * 0.08;
			taxLisarb += 1500.00 * 0.18;
			taxLisarb += (salaryRombus - 4500.00) * 0.28;
		}
		else {
			System.out.print("Wrong value entered");
		}
		if(taxLisarb == 0) {
			System.out.print("Free");
		}
		else {
		System.out.print("R$ " + taxLisarb);
		}
		sc.close();
}
}