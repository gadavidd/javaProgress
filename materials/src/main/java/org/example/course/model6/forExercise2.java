package materials.src.main.java.org.example.course.model6;

import java.util.Scanner;

public class forExercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <=20) {
				in ++;
			}
			else {
				out ++;
			}

		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}
}


