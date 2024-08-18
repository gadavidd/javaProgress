package materials.src.main.java.org.example.course.Model1to5;//Else-if
import java.util.Scanner;
public class exerc2{

//Make a program to read an integer, and then say whether this number is odd or even.

public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Is the number odd or even?");
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.print("even");
		}
		
		else {
			System.out.print("odd");
		}
		
		
		sc.close();
}
	
}