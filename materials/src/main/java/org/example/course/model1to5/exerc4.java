package materials.src.main.java.org.example.course.Model1to5;//Else-if
import java.util.Scanner;
public class exerc4{
//Calculate the duration of a game

public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Start time:");
		n = sc.nextInt();
		
		int l;
		System.out.println("Finish time:");
		l = sc.nextInt();
		
		if(l > n) {
			int h = l - n;
			System.out.print("The game last " + h + " hours");
		}	
		else if(n == l) {
			System.out.print("The game last 24 hours");
		}
		else {
			int h = l + (24 - n);
			System.out.print("The game last " + h + " hours");
		}

		sc.close();
}
	
}