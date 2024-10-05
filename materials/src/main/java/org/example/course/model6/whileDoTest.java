package materials.src.main.java.org.example.course.Model6;

import java.util.Scanner;

public class whileDoTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the password:");
		
		int password = sc.nextInt();
		
		while (password != 2002) {
			System.out.println("Invalid password");
			password = sc.nextInt();
		}
		
		System.out.println("Access allowed");
		sc.close();
	}
}


