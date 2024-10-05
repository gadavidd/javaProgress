package materials.src.main.java.org.example.course.Model6;

import java.util.Locale;
import java.util.Scanner;

public class forExercise4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the value of x");
			int x = sc.nextInt();
			System.out.println("Enter the value of y");
			int y = sc.nextInt();
			
			if(y == 0) {
				System.out.println("impossible division");
			}
			else {
				double z = (double)x/y;
				System.out.printf("%.1f%n",z);	
			}
		}

		sc.close();
	}
}


