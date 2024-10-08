package materials.src.main.java.org.example.course.model8.application;

import materials.src.main.java.org.example.course.model8.Utils.StatiCalculator;

import java.util.Locale;
import java.util.Scanner;

public class StaticMethod3 {

	public static void main(String[] args) {	
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = StatiCalculator.circumference(radius);
		double v = StatiCalculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", StatiCalculator.PI);
		
		
		sc.close();
	}
}
