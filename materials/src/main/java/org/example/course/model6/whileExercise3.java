package materials.src.main.java.org.example.course.Model6;

import java.util.Scanner;

public class whileExercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fuel code :");
		int fuel = sc.nextInt();
		int alcohol = 0 , gas = 0 , diesel = 0;
		
		while (fuel != 4 ) {
			if (fuel == 1) {
				alcohol += 1;
			}
			else if (fuel == 2) {
				gas += 1;
			}
			else if (fuel == 3) {
				diesel += 1;
			}
			fuel = sc.nextInt();
		}
			
		System.out.println("Thank very much");
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Gasoline: " + gas);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}
}


