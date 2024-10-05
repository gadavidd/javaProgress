package materials.src.main.java.org.example.course.Model6;

import java.util.Scanner;

public class forExercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for(int n = 1; n <= X; n ++) {
			if(n%2 != 0) {
				System.out.println(n);
			}
		}
		
		sc.close();
}
}


