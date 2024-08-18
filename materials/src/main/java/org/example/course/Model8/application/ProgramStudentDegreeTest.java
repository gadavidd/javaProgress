package materials.src.main.java.org.example.course.Model8.application;

import materials.src.main.java.org.example.course.Model8.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudentDegreeTest {

public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Student studentOne = new Student();
		
		System.out.println("Name: ");
		studentOne.name = sc.nextLine();
				
		System.out.println("Grade 1: ");
		studentOne.firstTrimester = sc.nextDouble();

		System.out.println("Grade 2: ");
		studentOne.secondTrimester = sc.nextDouble();
		
		System.out.println("Grade 3: ");
		studentOne.thirdTrimester = sc.nextDouble();
		
		System.out.println(studentOne);
		
		System.out.println(studentOne.aprove());
		
		sc.close();
	}
}
