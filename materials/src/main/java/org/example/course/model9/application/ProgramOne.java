package materials.src.main.java.org.example.course.model9.application;

import materials.src.main.java.org.example.course.model9.entities.Product;

import java.util.Locale;
import java.util.Scanner;
public class ProgramOne {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Name: ");
		String name = sc.nextLine();
				
		System.out.println("Price: ");
		double price = sc.nextDouble();

		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name,price,quantity);

		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		
		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println("Product data: " + product);
		
		sc.close();
	}
}
