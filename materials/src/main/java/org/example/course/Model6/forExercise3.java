package materials.src.main.java.org.example.course.Model6;

import java.util.Locale;
import java.util.Scanner;

public class forExercise3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double sum = 0;
		
		for(int i = 0; i < x; i++) {
			double N = sc.nextDouble();
			switch (i){
				case 0:
					sum += (2.0*N);
					break;
				case 1:
					sum += (3.0*N);
					break;
				case 2:
					sum += (5.0*N);
					break;
				default:
					break;

			}
		}
		sum = sum/10.0;
		System.out.printf("%.1f%n",sum);
		sc.close();
	}
}


