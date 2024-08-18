package materials.src.main.java.org.example.course.Model1to5;//Else-if
import java.util.Scanner;
public class exerc5{
//Calculate the purchase price of a product x

public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Item: ");
		n = sc.nextInt();
		
		int l;
		System.out.println("Amount: ");
		l = sc.nextInt();
		double total;
		
		if(n == 1) {
			total = (double) (l * 4.00);
		}	
		else if(n == 2) {
			total = (double) (l * 4.50);
		}
		else if(n == 3) {
			total = (double) (l * 5.00);
		}
		else if(n == 4) {
			total = (double) (l * 2.00);
		}
		else if(n == 5) {
			total = (double) (l * 1.50);
		}
		else {
			total = 0;
			System.out.print("WRONG CODE");
		}
		
		System.out.printf("TOTAL: R$ %.2f %n",total);

		sc.close();
}
	
}