package materials.src.main.java.org.example.course.Model6;

import java.util.Locale;
import java.util.Scanner;

public class forExercise7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial = n;
		
		if(n != 0) {
			for(int i = n-1; i >= 1; i--) {
				factorial = factorial * (i);
			}
		}
		System.out.println(factorial);
		sc.close();
	}
}


