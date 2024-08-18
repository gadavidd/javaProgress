package materials.src.main.java.org.example.course.Model1to5;//Else-if
import java.util.Scanner;
public class exerc3{
//Check if two values are multiples
public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of A:");
		n = sc.nextInt();
		
		int l;
		System.out.println("Enter the value of B:");
		l = sc.nextInt();
		
		if(n % l == 0 || n % l == 0) {
			System.out.print("They are multiple");
		}	
		else {
			System.out.print("They aren't multiple");
		}

		sc.close();
}
	
}