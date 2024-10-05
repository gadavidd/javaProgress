package materials.src.main.java.org.example.course.Model7;

import java.util.Scanner;

public class Functions {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
						
		int higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();
	}
	
	
	public static int max(int a, int b, int c){
		int maxValue;
		
		if(a > b && a > c) {
			maxValue = a;
		}
		else if(b > c) {
			maxValue = b;
		}
		else {
			maxValue = c;
		}
		
		return maxValue;
	}
	
	public static void showResult(int higherValue) {
		System.out.println("Higher value: " + higherValue);
	}
}