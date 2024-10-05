package materials.src.main.java.org.example.course.Model1to5;//Else-if
import java.util.Locale;
import java.util.Scanner;
public class exerc7{
//Check which region of a graph the value is in

public static void main (String[]args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X :");
		double x = sc.nextDouble();
		System.out.println("Enter the value of Y :");
		double y = sc.nextDouble();
		
		if(x == 0 && y == 0){
			System.out.print("Origin");
		}
		else if(x == 0 && y != 0){
			System.out.print("X axis");
		}
		else if(x != 0 && y == 0){
			System.out.print("Y axis");
		}
		else if(x > 0) {
			if(y > 0) {
				System.out.print("Q1");
		}	else {
				System.out.print("Q4");
		}}
		else if(x < 0) {
			if(y > 0) {
				System.out.print("Q2");
		}	else {
				System.out.print("Q3");
		}}
			
		sc.close();
}
}