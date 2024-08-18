package materials.src.main.java.org.example.course.Model6;

import java.util.Scanner;

public class whileExercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of X :");
		double x = sc.nextDouble();
		System.out.println("Enter the value of Y :");
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0 ) {
			if(x > 0) {
				if(y > 0) {
					System.out.println("first");
			}	else if (y < 0){
					System.out.println("fourth");
			}}
			else if(x < 0) {
				if(y > 0) {
					System.out.println("second");
			}	else if (y < 0) {
					System.out.println("third");
			}}
			
			System.out.println("Enter the value of X :");
			x = sc.nextDouble();
			System.out.println("Enter the value of Y :");
			y = sc.nextDouble();
		}

		sc.close();
	}
}


