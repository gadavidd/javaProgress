package materials.src.main.java.org.example.course.model8.application;

import materials.src.main.java.org.example.course.model8.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployeeTest {

public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
				
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();

		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}
}
